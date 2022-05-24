package tostring;

public class PessoaTeste {
	public static void main(String[] args) {

		Pessoa person1 = new Pessoa();
		Pessoa person2 = new Pessoa();

		person1.nome = "gustavo";
		person1.sexo = "masculino";
		person1.cpf = 00000000000;
		person1.peso = 78;

		// atribuição pessoa2
		person2.nome = "maria";
		person2.sexo = "feminino";
		person2.cpf = "111.111.111-11";
		person2.peso = " 88kg";

		// imprimindo dados das pessoas no console

		person1.imprimirDados();
		person2.imprimirDados();

		System.out.println(person1);
		System.out.println(person2);
	}

}
