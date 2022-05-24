package sobreexercicio;

public class Retangulo extends Quadrilatero {
	private double base;
	private double area;

	public Retangulo(double base, double area, String cor) {
		super (cor);
		this.base = base;
		this.area = area;
		
	}
	
	public void calcularArea() {
		this.resultado = base * area;
		System.out.println("Retangulo: " +resultado);
	}

	
}
