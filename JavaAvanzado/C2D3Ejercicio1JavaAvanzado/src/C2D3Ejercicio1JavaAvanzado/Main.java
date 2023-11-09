package C2D3Ejercicio1JavaAvanzado;



public class Main {

	public static void main(String[] args)throws InterruptedException {
		int numAgentes = 5;

        for (int i = 1; i <= numAgentes; i++) {
            Agente agente = new Agente(i);
            Thread thread = new Thread(agente);
            Thread.sleep(1000);
            thread.start();
           // thread.join();
            System.out.println("------------------------");
        }
	}

}
