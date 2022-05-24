package polimorfismo;

import java.util.Scanner;

public class ImpressoraTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Impressora impressora = null;

		System.out.println("1 - jato de tinta");
		System.out.println("2 - Laser");
		System.out.println("Opção: ");
		int opcao = input.nextInt();

		switch (opcao) {
		case 1:
			//UPCASTING
			impressora = new JatoDeTinta();

			break;

		case 2:
			//UPCASTING
			impressora = new Laser();
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		impressora.imprimir();
		//downCasting
		if(impressora instanceof JatoDeTinta) {
		JatoDeTinta jt =(JatoDeTinta) impressora;
		jt.recarregarCartucho();
		}
		
		
	}
}
