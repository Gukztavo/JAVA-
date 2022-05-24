package sobreexercicio;

public class Losango extends Quadrilatero{
	private double diagonalMenor;
	private double diagonalMaior;
	public Losango(String cor, double diagonalMenor, double diagonalMaior) {
		super(cor);
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea (
			) {
		this.resultado = (diagonalMenor * diagonalMaior) / 2 ; 
		System.out.println("Losango: " + resultado);
	}

}
