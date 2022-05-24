package classabstrata;

public class Funcionario {
	protected String nome;
	protected long cpf;
	protected double salarioBase;
	protected double salario;
	
	public Funcionario(String nome, long cpf, double salarioBase) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
		this.salario = 0;
	}

	public double calcularSalario () {
		return 0.0;
	
	}
}
