package programas.Cuenta;

public class CuentaAhorro extends Cuenta{
	
	private double interes;

	public CuentaAhorro(double saldo, double interes) {
		super(saldo);
		this.interes = interes;
	}

	@Override
	public void depositar(double monto) {
	    super.depositar(monto); 
	    double montoInteres = monto * interes;
	    this.saldo += montoInteres; 
	    
	    System.out.println("--- Detalle Cuenta de Ahorro ---");
        System.out.println("Interés aplicado (" + (interes * 100) + "%): " + montoInteres);
        System.out.println("Saldo total final: " + this.saldo);
	}
}
