package sobreposicao;

public class Mamifero extends Object// Object � uma classe nativa por isso n�o da erro 
{

	protected String nome;

	public Mamifero(String nome) {
		this.nome = nome;
	}

	public void emitirSom() {
		System.out.println(this.nome + " Som generico");
	}

	@Override
	public String toString() {
		return "Mamifero [nome=" + nome + "]";
	}

	
}
