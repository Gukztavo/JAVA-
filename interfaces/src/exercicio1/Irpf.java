package exercicio1;

public class Irpf implements Imposto {
	public double calcularImposto (double mercadoria) {
		return (mercadoria*0.075) + mercadoria;	
	}

}
