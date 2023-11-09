package C2D3Ejercicio2JavaAvanzado;

public class Trabajador extends Thread {

	private int idTrabajador;
	

	

	public Trabajador(int i) {
		idTrabajador= i ;
	}

	public long getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int id) {
		this.idTrabajador = id;
	}

	@Override
	public void run() {
		ensamblarProduto();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		controlCalidad();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		empaquetarProduto();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		super.run();
	}

	public synchronized void   ensamblarProduto () {
		System.out.println("Trabajador " + this.getIdTrabajador() + " esta ensamblando el producto");
	}

	public synchronized void controlCalidad() {
		System.out.println("Trabajador " + this.getIdTrabajador() + " esta realizando el control de calidad");
	}

	public synchronized void empaquetarProduto() {
		System.out.println("Trabajador " + this.getIdTrabajador() + " esta empaquetando el producto");
	}

}
