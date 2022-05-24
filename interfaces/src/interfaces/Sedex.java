package interfaces;

public class Sedex implements Frete {
	@Override
	public double calcularFrete(int distancia) {
		return 13.00 + (0.45 * distancia);
	}

}
