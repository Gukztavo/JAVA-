package fundamentosOO;

public class Cadastro {
	private int registro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private int telefone;

	// endereco funcionarios
	private String endereco;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Cadastro(int registro, String nome, String dataNascimento, String sexo, String setor, int telefone,
			String endereco, String rua, int numero, String bairro, String cidade, String estado) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public void gerarRelatorio() {
		System.out.println("=================");
		System.out.println("==DADOS DO FUCINARIO==");
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data Nascimeto : " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Endereço: ");
		System.out.println("Rua: " + this.rua);
		System.out.println("Numero: " + this.numero);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
	}

}
