package programas.Empleado;

public class Empleado {

	protected String nombre;
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void resumen() {
		System.out.println("Nombre del empleado " + nombre);
	}
	
}
