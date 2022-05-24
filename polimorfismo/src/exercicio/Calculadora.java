package exercicio;

public class Calculadora {
	private double media;

	public Calculadora() {
		
		this.media = 0.0;
	}

	public void calculadorMedia(double num1, double num2) {
		this.media = (num1 + num2) / 2;
		System.out.println(media);
	}
	
	public  void calculadorMedia(double num1, double num2 , double num3) {
		this.media = (num1+num2+num3)/ 3 ;
		System.out.println(media);
	}

	public void calculadorMedia(double n1, double n2 , double n3 , double n4) {
		
		this.media = (n1+n2+n3+n4)/4;
		System.out.println(media);
	}
	
	
 
}
