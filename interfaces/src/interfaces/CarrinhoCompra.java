package interfaces;

public class CarrinhoCompra {

	private double valorProdutos;
	private int distancia;
	private Frete frete;

	public CarrinhoCompra(double valorProdutos, int distancia,Frete frete) {

		this.valorProdutos = valorProdutos;
		this.distancia = distancia;
		this.frete = frete;
	}

	public void realizarCompra() {
		double valorTotalCompra = 0.0;

		valorTotalCompra = this.valorProdutos + this.frete.calcularFrete(this.distancia);

		System.out.println("VALOR TORAL DA COMPRA : R$: " + valorTotalCompra);
	}

}
