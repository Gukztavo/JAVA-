package classabstrata;

public class Comissionado extends Funcionario  {

	private double totalVendas;
	private double taxaComissao;
	
	public Comissionado(String nome, long cpf, double salarioBase,double totalVendas, double taxaComissao) {
		super(nome,cpf,salarioBase);
		this.taxaComissao = taxaComissao;
		this.totalVendas = totalVendas;
		
		
	}
	public double calcularSalario() {
		return this.salario = (totalVendas * taxaComissao ) + salarioBase;
}

}
