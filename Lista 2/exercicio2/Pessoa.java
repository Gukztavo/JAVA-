package exercicio2;

public class Pessoa {
	String nome ; 
	String sexo;
	String cpf;
	String idade;
	String altura;
	double peso;
	
	public void andar (){
	 
	System.out.println(nome+"est� andando e parou de ser sedentaria ");
	
	}
	
	public void correr() {
		System.out.println(nome+ " est� correndo");
	}
	
	public void falar () {
		System.out.println(nome+ "est� falando ");	
	}

	public void dormir () {
		System.out.println(nome+ "Est� dormindo ");
	
	}
	
	public void imprimirDados() {
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(cpf);
		System.out.println(idade);
		System.out.println("Altura : "+altura+"CM ");
		System.out.println("Peso : "+peso+"KG");
	}
	
}

