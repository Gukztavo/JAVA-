package heranca2;

import java.util.Scanner;

public class ImovelTeste {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Imovel imovel = null;

		System.out.println("1-Imovel usado");
		System.out.println("2-Imovel novo");
		System.out.println("Opcao:");
		int opcao = input.nextInt();

		switch (opcao) { // UpCasting
		case 1:
			Imovel imovel1 = new ImovelUsado("Av: Bernaro, Numero : 68, Centro, PG", 36000.0, 12000.0);
			imovel1.imprimirDados();

			break;
		case 2:
			Imovel imovel2 = new ImovelNovo("Av carlos, Numero : 66, Centro, PG", 36000.0, 48000.0);
			imovel2.imprimirDados();
			break;

		}
		imovel.imprimirDados();
		// ImovelNovo DownCasting 
		if(imovel instanceof ImovelNovo) {
			ImovelNovo imovelNovo1 = (ImovelNovo)imovel;
			imovelNovo1.imprimirDados();
		}else {
			ImovelUsado  imovelUsado1 = (ImovelUsado)imovel;
			imovelUsado1.imprimirDados();
		}
		
		
		
	}
}
