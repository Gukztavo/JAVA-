package encapsulamentoex;

public class ContaBancaria {

	private int codigo;
	private String titular;
	private double saldo;

	public ContaBancaria(int codigo, String titular) { //metodo construtor
		this.codigo = codigo;
		this.setTitular(titular);
		this.saldo = 0.00;

	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("o saldo é insuficiente");
		}
	}

	public void despositar(double valor) {
		this.saldo += valor;
		this.calcularRendimento();
		System.out.println("deposito realizado com sucesso.");

	}

	public void imprimirSaldo() {
		System.out.println("========================");
		System.out.println("Conta: " + this.codigo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo : R$ " + this.saldo);
		System.out.println("========================");

	}

	private void calcularRendimento() {
		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(!titular.equals("")) {  //verifica se a string não é vazia
			
		this.titular = titular;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public double getSaldo() {
		return saldo;
	}



}
