package programas.Producto;

public class ProductoDigital extends Producto {

	private int cantidad;

	public ProductoDigital(String nombre, double precio, int cantidad) {
		super(nombre, precio);
		this.cantidad = cantidad;
	}
	
	

	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public void mostrarDescripcion() {
		super.mostrarDescripcion();
		System.out.println("Hay en existencia: " + cantidad);
	}
	
}
