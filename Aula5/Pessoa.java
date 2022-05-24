package tostring;

public class Pessoa {
	String nome;
	String sexo;
	int cpf;
	double peso;
	
	public void andar () {
		System.out.println(nome+"está andando");
	}

	public void falar () {
		System.out.println(nome+ " está andando ");
	}
	
	public void cair () {
		System.out.println(nome + "caiu ");
	}

	public void imprimirDados () {
		System.out.println("Nome:" + nome);
		System.out.println("sexo:" + sexo);
		System.out.println("cpf:" + cpf);
		System.out.println("Nome:" + peso);
	}

	@Override
	public String toString() {
		return "pessoateste [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", peso=" + peso + "]";
	}
}
