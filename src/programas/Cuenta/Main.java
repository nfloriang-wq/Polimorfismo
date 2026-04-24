package programas.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		Cuenta mc = new CuentaAhorro(5000, 0.05);
		
		mc.depositar(500);
	}
	
}
