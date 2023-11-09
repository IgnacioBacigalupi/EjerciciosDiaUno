package C2D3Ejercicio2JavaAvanzado;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		int numTrajadores = 5; // 

        for (int i = 1; i <= numTrajadores; i++) {
            Trabajador trabajador = new Trabajador(i);
            Thread thread = new Thread(trabajador);
            Thread.sleep(1000);
            thread.start();
            System.out.println("-/-/--/-/--/-/--/-/-");
        }
	}

}
