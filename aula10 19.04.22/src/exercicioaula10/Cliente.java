package exercicioaula10;

public class Cliente {
	private int codigo;
	private String nome;
	private String data;
	private EstadoCivil estado;

	public Cliente(int codigo, String nome, String data) {
		this.codigo = codigo;
		this.nome = nome;
		this.data = data;
		this.estado = EstadoCivil.INDEFINIDO;

	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", data=" + data + ", estado=" + estado + "]";
	}

	public void setEstadoCivil(EstadoCivil estado) {
		this.estado = estado;
	}

}
