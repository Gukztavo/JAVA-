package exercicio1;

public class CalculadoraImpostoTeste {
	public static void main(String[] args) {
		CalculadoraImposto calc1 = new CalculadoraImposto (1000.00,new Irpf());
		calc1.calcularImposto();
	}
	
}
