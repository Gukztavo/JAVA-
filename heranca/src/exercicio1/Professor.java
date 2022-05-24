package exercicio1;

public class Professor extends Pessoa {
	private double salario;

	public Professor(String nome, int idade, double salario,Endereco endereco) {
		super(nome, idade,endereco);
		this.salario = salario;
	}

	public void calcularSalario() {
		System.out.println(this.nome + " " + this.idade + " idade, recebe R$:" + this.salario + "Reais");
		System.out.println("Logradouro "+this.endereco.getLogradouro());
		System.out.println(" Numero"+this.endereco.getNumero());
		System.out.println(" bairro"+this.endereco.getBairro());
		System.out.println(" cidade"+this.endereco.getCidade());
		System.out.println("Unidade Federativa: "+this.endereco.getUnidadeFederativa());
	}
	

}
