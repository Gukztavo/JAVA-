package sobreexercicio;

public class Quadrado extends Quadrilatero {
	private double lado;
	
	
	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}


	public void calcularArea() {
		this.resultado = lado*lado;
		System.out.println("Quadrado: " + resultado);
	}
}
