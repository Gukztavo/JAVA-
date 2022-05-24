package aula6;

public class Pessoa {

	String nome;
	int idade;
	double peso;

	public Pessoa(String nome, int idade, double peso) {

		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public Pessoa(String nome) {
		this(nome,0,0.00);
		
	}

	public Pessoa(String nome, int idade) {
		this(nome, idade, 0.00);
	}

	void andar() {
		System.out.println(nome + "esta andando");
	}

	public void falar() {
		System.out.println(nome + "está falando");
	}

	public void correr() {
		System.out.println(nome + "esta correndo");

	}

	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + " anos , peso= " + peso + " KG]";
	}

}
