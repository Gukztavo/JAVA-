package heranca2;

public class ImovelUsado extends Imovel {
	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	public void imovelUsado () {
		
		
	}
	public void imprimirDados() {
		
		double valorTotal = this.valorBase - this.valorDesconto;
		

		System.out.println("=========== imovel usado ==========");
		super.imprimirDados();
		System.out.println("Valor Desconto : R$" + this.valorDesconto);
		System.out.println("Valor total, R$: " + valorTotal);

		
	}
}
