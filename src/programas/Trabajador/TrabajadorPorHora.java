package programas.Trabajador;

public class TrabajadorPorHora extends Trabajador{

	private int horasTrabajadas;
	private double pagoHora;
	
	public TrabajadorPorHora(String nombre, int horasTrabajadas, double pagoHora) {
		super(nombre);
		this.horasTrabajadas = horasTrabajadas;
		this.pagoHora = pagoHora;
	}

	@Override
	public void calcularPago() {
		System.out.println("--- Datos ---");
		super.calcularPago();
		System.out.println("Cuantas horas trabajo: " + horasTrabajadas);
		System.out.println("El pago por hora es de: " + pagoHora);
		System.out.println("Total: " + horasTrabajadas * pagoHora);
	}
	
	
	
}
