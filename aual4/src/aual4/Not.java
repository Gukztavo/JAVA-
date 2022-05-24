package aual4;


public class Not {

	String modelo;
	String marca;
	String ram;
	String armazenamento ;
	String processador;
	String tela;

	public void ligar() {
		System.out.println(modelo+" Esta ligando \n");
	}
	
	public void desligar() {
		System.out.println(modelo + "Está Desligado \n");
	}
	
	public void processarInformacoes() {
		System.out.println(modelo+ "Ele Processa informações\n");
	}
	
	public void conectarInternet  () {
		System.out.println(modelo+ "Está conectado a internet \n");
	}
}