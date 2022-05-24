package exercicio1;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private Endereco endereco;
	private EstadoCivil estadoCivil;

	public Pessoa(String nome, String dataNascimento, String sexo, String email, EstadoCivil estadoCivil,
			String logadouro, int numero, String bairro, String cidade, String unidadeFederativa) {

		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = new Endereco(logadouro, numero, bairro, cidade, unidadeFederativa);
	}

	public void emitirRelatorio() {
		System.out.println("======================================");
		System.out.println("Nome:" + this.nome);
		System.out.println("Data Nascimento : " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Email: " + this.email);
		System.out.println("Estado Civil: " + this.estadoCivil.getEstado());
		System.out.println("Logadouro : " + this.endereco.getLogadouro());
		System.out.println("Numero : " + this.endereco.getNumero());
		System.out.println("bairro : " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Unidade Federativa: " + this.endereco.getUnidadeFederativa());
	}

	public Endereco getEndereco() {
		return endereco;
	}

	

}
