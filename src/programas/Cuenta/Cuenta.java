package programas.Cuenta;

public class Cuenta {

	protected double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
		System.out.println("Deposito de " + monto);
		System.out.println("El saldo es de: " + saldo);
	}
	
}
