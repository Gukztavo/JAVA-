package sobreposicao;

public class MamiferoTeste {
	public static void main(String[] args) {
		Gato gato = new Gato("Amarelo");
		gato.emitirSom();
		
		Cachorro cachorro = new Cachorro("Spyke");
		cachorro.emitirSom();
		
		System.out.println(cachorro);
	}
}
