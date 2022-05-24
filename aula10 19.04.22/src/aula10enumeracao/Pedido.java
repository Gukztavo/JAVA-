package aula10enumeracao;

public class Pedido {
	private int id;
	private String data;
	private Status statusPedido;

	public Pedido(int id, String data) {
		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDADO_PAGAMENTO;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", statusPedido=" + statusPedido + "]";
	}

	public void setStatusPedido(Status statusPedido) {
		this.statusPedido = statusPedido;
		
		
	}

}
