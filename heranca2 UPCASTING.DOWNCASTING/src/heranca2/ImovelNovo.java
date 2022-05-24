package heranca2;

public class ImovelNovo extends Imovel {
	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public void imovelNovo() {

	}

	public void imprimirDados() {

		double valorTotal = this.valorBase + this.valorAdicional;
		System.out.println("=========== imovel novo ==========");
		super.imprimirDados();
		System.out.println("Valor Adicional : R$" + this.valorAdicional);
		System.out.println("Valor total, R$: " + valorTotal);

	}
}
