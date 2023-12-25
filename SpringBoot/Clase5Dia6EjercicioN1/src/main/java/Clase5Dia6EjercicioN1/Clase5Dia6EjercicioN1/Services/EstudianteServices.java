package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Services;

import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Repository.EstudiantesRepository;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Calificaciones;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EstudianteServices  implements IEstudianteService {
    @Autowired
      private EstudiantesRepository estudiantesRepository;
    @Override
    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return estudiantesRepository.obtenerEstudiantes() ;
    }




}
