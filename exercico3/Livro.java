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
			System.out.println(titulo+ " está disponivel ");
			
		}else { 
		
			System.out.println(titulo+"Não está disponivel");
		}
	
	}
	
	public void indisponivel () {
		if (disponivel== true) {
			disponivel = false;
			System.out.println(titulo+ " Está Indisponivel ");
			
		}else {
			System.out.println(titulo+ "Está dispovel ");
		}
	}
}
