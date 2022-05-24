package heranca; // pra saber se é h/erança fazer a pergunta se carro é um tipo de veiculo se sim é herança

public class Veiculo {
	protected String modelo;
	protected String fabricante;
	protected int ano;
	protected int numeroPassageiros;
	protected String combustivel;

	public Veiculo(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.numeroPassageiros = numeroPassageiros;
		this.combustivel = combustivel;
	}

	public void abastecer() {
		System.out
				.println(this.fabricante + " " + this.modelo + " esta abastecendo com combustivel " + this.combustivel);

	}

}
