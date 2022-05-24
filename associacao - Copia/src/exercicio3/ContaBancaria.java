package exercicio3;

public class ContaBancaria {
	private int cpf;
	private int rg;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private double rendaMensal;
	private Endereco endereco;
	private double saldo;

	public ContaBancaria(int cpf, int rg, String nome, String dataNascimento, String sexo, double rendaMensal,
			String logradouro, int numero, String bairro, String cidade, String estado, double saldo, double valor) {
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, estado);
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor >= 1) {
			saldo = saldo + valor;
		}
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		}

	}

	public void imprimirRelatorio() {
		System.out.println("");
	}

}
