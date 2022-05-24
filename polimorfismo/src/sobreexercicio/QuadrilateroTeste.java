package sobreexercicio;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado ("Verde", 5.0);
		quadrado.calcularArea(); 
		
		Retangulo retangulo = new Retangulo(10.0, 20.0,"Amarelo");
		retangulo.calcularArea();
		
		Losango losango =  new Losango ("Vermelho", 10.0,5.0);
		losango.calcularArea();
	}

}
