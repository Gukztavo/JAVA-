package exercico3;

public class LivroTeste {
	public static void main(String[] args) {
		 Livro livro1 = new Livro() ;
		 Livro livro2 = new Livro ();
		 Livro livro3 = new Livro ();
		 
		 livro1.titulo = "joaninha";
		 livro1.autor = "  Ar  ";
		 livro1.editora = "rebarter richards";
		 livro1.paginas =" 500 paginas";
		 livro1.ano  =  " Lançamento no ano de 2010";
		 livro1.situacao= "Disponivel ";
		 
		 livro2.titulo = "Peixe";
		 livro2.autor = " mar";
		 livro2.editora = "rebarter richards";
		 livro2.paginas =" 230 paginas";
		 livro2.ano  =  " Lançamento no ano de 2012";
		 livro2.situacao= "indisponivel ";
		 
		 livro3.titulo = " gato";
		 livro3.autor = " terra";
		 livro3.editora = "rebarter richards";
		 livro3.paginas =" 431 paginas";
		 livro3.ano  =  " Lançamento no ano de 2022";
		 livro3.situacao= "Disponivel ";
		 
		 
		 livro2.disponivel();
		 
	}
}
