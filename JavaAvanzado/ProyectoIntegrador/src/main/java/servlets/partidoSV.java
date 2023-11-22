
package servlets;

import com.google.protobuf.TextFormat.ParseException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Partido;


@WebServlet(name = "partidoSV", urlPatterns = {"/partidoSV"})
public class partidoSV extends HttpServlet {
Controladora controlLogica = new Controladora();


 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        //Se obtienen los PARTIDOS desde la BD
        List<Partido> listPartidos = controlLogica.traerPartidos();
        
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("partidos", listPartidos);
        
        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);   

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //Obtener datos desde el JSP
        String fechaIngresada = request.getParameter("fecha_partido");
        String resultadoEquipo1 = request.getParameter("resultado_equipo1");
        String resultadoEquipo2 = request.getParameter("resultado_equipo2");
        String idEquipo1 = request.getParameter("id_equipo1");
        String idEquipo2 = request.getParameter("id_equipo2");

        try {
           
            //Crear nuevo PARTIDO
            Partido partido = new Partido();
            
            partido.setFecha(fechaIngresada);
            partido.setResultadoEquipo1(Integer.parseInt(resultadoEquipo1));
            partido.setResultadoEquipo2(Integer.parseInt(resultadoEquipo2));
            
            //Mandar a persistir el partido, enviado los IDs 
            controlLogica.crearPartido(partido, Long.parseLong(idEquipo1), Long.parseLong(idEquipo2));

            // Redirigir de vuelta al formulario
            request.getRequestDispatcher("index.jsp").forward(request, response);               
            
        } catch (ParseException ex) {
            Logger.getLogger(partidoSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
