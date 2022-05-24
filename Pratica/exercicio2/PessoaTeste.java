package exercicio2;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa person1 = new Pessoa ();
		Pessoa person2 = new Pessoa ();
		Pessoa person3 = new Pessoa ();
				
		person1.nome = "Nelson";
		person1.sexo = "masculino";
		person1.cpf = "00000000000"; // int
		person1.idade = "17 anos";
		person1.altura = " 178cm";
		person1.peso = 80; //double
		
		person2.nome = "Nelson";
		person2.sexo = "masculino";
		person2.cpf = "00000000000"; // int
		person2.idade = "17 anos";
		person2.altura = " 178cm";
		person2.peso = 80; //double
		
		person3.nome = "Nelson";
		person3.sexo = "masculino";
		person3.cpf = "00000000000"; // int
		person3.idade = "17 anos";
		person3.altura = " 178cm";
		person3.peso = 80; //double
		
	
		 person1.imprimirDados();
		 person2.imprimirDados();
		 person3.imprimirDados();
	}
}
