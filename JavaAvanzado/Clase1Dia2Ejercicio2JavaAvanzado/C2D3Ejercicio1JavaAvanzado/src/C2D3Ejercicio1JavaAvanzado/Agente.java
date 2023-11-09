package C2D3Ejercicio1JavaAvanzado;

public class Agente extends Thread {
	private long id;

	public Agente(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public void run() {
		recibirLLamada();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		resolverconsulta();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		registrarInformacion();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

	private void registrarInformacion() {
		System.out.println("agente " + id + " registrando informacion");
		
	}

	private void resolverconsulta() {
		System.out.println("agente "+ id+  " Resolviendo consulta");
		
	}

	private void recibirLLamada() {
		System.out.println("agente " + id + " Recibiendo llamada");

	}

}
