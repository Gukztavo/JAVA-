package lista2;

public class Carro {

	String modelo;
	String marca;
	int anoFabricacao;
	String placa;
	String cor;
	String chassi;
	String renavam;
	
	boolean ligado = false;
	
	public void ligar () {
		if (ligado == true) {
			
			ligado = true;
			System.out.println(modelo +" está ligando.");
			
		}else {
			System.out.println(modelo+ "já está ligado ");;
		}
		
	}
	 public void desligar () {
		 if (ligado == true) {
			 ligado = false;
			 System.out.println(modelo+ "esta desligando ");
			 
		 }else {
			 System.out.println(modelo+"já esta desligado");
		 }
	 }
	
	 public void acelerar () {
		 
		System.out.println(modelo+ "está aceletando ");
	 }
	
	 public void frear () {
		 System.out.println(modelo + "o carro esá freando ");
	 }
	
	 public void imprimirDados() {
			
			System.out.println("====================");
			System.out.println("Modelo: " + modelo);
			System.out.println("Marca: " + marca);
			System.out.println("Ano de Fabricação: " + anoFabricacao);
			System.out.println("Placa: " + placa);
			System.out.println("Cor: " + cor);
			System.out.println("Ligado: " + ligado);
			System.out.println("chassi: "+ chassi);
			System.out.println("Renavam: "+ renavam );
	 }
}
