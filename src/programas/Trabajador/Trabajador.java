package programas.Trabajador;

public class Trabajador {

	private String nombre;

	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void calcularPago() {
		System.out.println("Pago para el trabajador: " + nombre);
	}
	
}
