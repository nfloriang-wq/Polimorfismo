package programas.Producto;

public class Producto {

	private String nombre;
	private double precio;
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void mostrarDescripcion() {
		System.out.println("Producto: " + nombre);
		System.out.println("Precio: " + precio);
	}
	
}
