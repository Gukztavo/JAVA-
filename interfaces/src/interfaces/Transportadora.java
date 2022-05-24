package interfaces;

public class Transportadora implements Frete{
	public double calcularFrete (int distancia) {
		return 20.00 + (0.60*distancia);
	}

}
