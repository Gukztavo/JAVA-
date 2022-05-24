package exercicio2;

public enum Modalidade {
	PRESENCIAL("Presencial"),
	DISTANCIA("A Distancia");

	private String modalidade;

	private Modalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getModalidade() {
		return modalidade;
	}

}
