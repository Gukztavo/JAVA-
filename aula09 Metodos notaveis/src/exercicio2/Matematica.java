package exercicio2;

import java.util.Scanner;

public class Matematica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um numero ");
		int num1 = Integer.parseInt(entrada.nextLine());

		System.out.println("Informe um segundo numero ");
		int num2 = Integer.parseInt(entrada.nextLine());

		double valorMaior =Math.max(num1, num2 );
		
		double raiz = Math.sqrt(num1);
		
		double potencia = Math.pow(num1, num2);
		
		System.out.println("Maior valor: "+valorMaior);
		System.out.println("Raiz do primeiro Num: "+raiz);
		System.out.println("valor double num1 elevado a num 2: "+ potencia);
		
	}
	

}
