package exercico3;

public class Livro {

	String titulo;
	String autor;
	String editora;
	String paginas;
	String ano;
	String situacao;
	boolean disponivel = false; 
	
	public void disponivel  () {
		if (disponivel == false ) {
			
			disponivel = true;
			System.out.println(titulo+ " est� disponivel ");
			
		}else { 
		
			System.out.println(titulo+"N�o est� disponivel");
		}
	
	}
	
	public void indisponivel () {
		if (disponivel== true) {
			disponivel = false;
			System.out.println(titulo+ " Est� Indisponivel ");
			
		}else {
			System.out.println(titulo+ "Est� dispovel ");
		}
	}
}
