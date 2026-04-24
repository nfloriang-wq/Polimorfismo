package programas.Persona;

public class Persona {

	protected String nombre;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void presentarse() {
		System.out.println("Mi nombre es: " + nombre);
	}
	
}
