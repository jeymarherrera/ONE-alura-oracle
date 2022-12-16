
class Cuenta {

	private  double saldo;
	private  int agencia;
	//private  int numero;
	private Cliente titular = new Cliente();
	private static int totalCuentas = 0;

	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		totalCuentas++;
		System.out.println("Se han creado un total de "+totalCuentas+" cuentas.");
	}
	
	public void realizarDeposito(double valor){
		this.saldo = this.saldo + valor;	
	}
	
	public boolean realizarRetiro(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;	
			return true;
		}
		return false;
		
	}
	
	public boolean realizarTransferencia(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;	
			//cuenta.saldo = cuenta.saldo + valor;
			cuenta.realizarDeposito(valor);
			return true;
		}
		return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
	public void setAgencia(int nuevaAgencia){
		if(nuevaAgencia > 0) {
			this.agencia = nuevaAgencia;
		}else {
			System.out.println("No estan permitidos valores negativos o igual a cero");
		}
	}*/
	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Cuenta.totalCuentas;
	}
	
}
