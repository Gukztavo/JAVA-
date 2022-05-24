package classabstrata;

public class Horista extends Funcionario {
	private double precoHora;
	private int horasTrabalhadas;

	public Horista(String nome, long cpf, double salarioBase, double precoHora, int horasTrabalhadas) {
		super(nome, cpf, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.precoHora = precoHora;
	}
	public double calcularSalario() {
	return this.salario= (precoHora * horasTrabalhadas)+salarioBase;
	
	}

}
