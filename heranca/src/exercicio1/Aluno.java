package exercicio1;

public class Aluno extends Pessoa {
	private String curso;

	public Aluno(String nome,int idade, String curso, Endereco endereco) {
		super(nome, idade, endereco);
		this.curso = curso;
	
	}
	
	public void realizarMatricula() {
		System.out.println(this.nome+" "+this.idade+ " anos, se matriculou em:"+this.curso);
		System.out.println("Logradouro "+this.endereco.getLogradouro());
		System.out.println(" Numero"+this.endereco.getNumero());
		System.out.println(" bairro"+this.endereco.getBairro());
		System.out.println(" cidade"+this.endereco.getCidade());
		System.out.println("Unidade Federativa: "+this.endereco.getUnidadeFederativa());
	}
	
	
	
}
