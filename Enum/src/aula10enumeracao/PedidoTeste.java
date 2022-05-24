package aula10enumeracao;

public class PedidoTeste {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido (111," 19/04/2022");
		System.out.println(pedido1);		
		
		pedido1.setStatusPedido(Status.PROCESSANDO);
		System.out.println(pedido1);
	}
}

