package exercicio1;

public class CalculadoraImposto {
	private double mercadoria;
	private Imposto imposto;
	
	public CalculadoraImposto(double mercadoria, Imposto imposto) {
		
		this.mercadoria =  mercadoria;
		this.imposto = imposto;
		
		
	}
		public void calcularImposto() {
			double aux;
			aux =this.imposto.calcularImposto(mercadoria);
			System.out.println("Imposto calculado : "+aux);
		}
	
	
	
	

}
