package aual4;

 import java.util.Scanner;

public class Notbooks {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 //instanciação dos nots
		 
		 Not teste = new Not ();
		 
		 // atribuição de valores pedidno ao usuario
		 
		 	teste.marca = "Marca: hp\n";
			teste.modelo = "Modelo: AGAPÊ\n";
		 	teste.tela = "Tamanho da tela : 14 polegadas\n ";
			teste.processador = "Modelo Processador AMD\n";
			teste.ram = "Ram: 16 gb\n";
			teste.armazenamento = "Armazenamento :320gb\n";
	
			entrada.nextLine(); // limpeza de buffer
	
			
			System.out.println("ATRIBUTOS teste");
			System.out.println(teste.modelo);
			System.out.println(teste.marca);
			System.out.println(teste.tela);
			System.out.println(teste.processador);
			System.out.println(teste.ram);
			System.out.println(teste.armazenamento);
	
					entrada.close();
						teste.ligar();
						teste.desligar();
						teste.processarInformacoes();
						teste.conectarInternet();
	}
	

	
}
