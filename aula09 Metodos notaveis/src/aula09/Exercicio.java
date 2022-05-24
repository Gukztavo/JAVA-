package aula09;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String teste = "Teste Sala";
		System.out.println(teste.charAt(3));

		System.out.println(teste.length());

		System.out.println(teste.toLowerCase());

		String[] stringDivida = teste.split(" ");

		System.out.println(stringDivida[0]);
		System.out.println(stringDivida[1]);

		System.out.println("Informe um segunda String\n");
		String nome = entrada.nextLine();

		System.out.println("String2: " + nome);

		if (nome.equals(teste)) {
			System.out.println("sao iguais");
		} else {
			System.out.println("nao sao iguais "
					);
		}

	}
}
