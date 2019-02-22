package entidades;

public class contaDoBanco {
	private String name;
	private static int numeroDaConta;
	private double depositoInicial;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public contaDoBanco(String name, int numeroDaConta, double depositoInicial) {
		this.name = name;
		this.numeroDaConta = numeroDaConta;
		deposito(depositoInicial);
	}
	
	public contaDoBanco(String name, int numeroDaConta) {
		this.name = name;
		this.numeroDaConta = numeroDaConta;
	}
	
	
	public void deposito(double valor) {
		depositoInicial += valor;
	}
	
	
	public void saque(double valor) {
		depositoInicial -= valor+ 5.0;
	}
	
	public String toString() {
		return "Conta: "
		+numeroDaConta
		+  ", Nome: "
		+ name
		+   ", Saldo: $ " 
		+ String.format("%.2f", depositoInicial);
	}
	
 
}
