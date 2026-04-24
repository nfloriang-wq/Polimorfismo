package programas.Empleado;

public class Vendedor extends Empleado{

	private double comision;
	
	public Vendedor(String nombre, double comision) {
        super(nombre); 
        this.comision = comision;
    }

	@Override
	public void resumen() {
		super.resumen();
		System.out.println("La comision es de: " + comision);
	}


	
}
