package interfaces;

public class Correios implements Frete {

	public double calcularFrete(int distancia) {
		return 10.00 + (0.30*distancia);
	}
}
	