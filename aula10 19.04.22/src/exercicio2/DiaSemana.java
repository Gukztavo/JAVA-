package exercicio2;

public enum DiaSemana {
	DOMINGO(1, "domingo"),
	SEGUNDA(2,"Segunda feira"),
	TERCA (3, "Terça Feira"),
	QUARTA(4, "Quarta Feira"),
	QUINTA(5, "Quinta Feira"),
	SEXTA(6, "Sexta Feira"),
	SABADO(7,"Sabado");
	
	private int dia;
	private String diaExtenso;
	
	private DiaSemana(int dia, String diaExtenso) {
		this.dia = dia;
		this.diaExtenso = diaExtenso;
	}

	public int getDia() {
		return dia;
	}

	public String getDiaExtenso() {
		return diaExtenso;
	}
}
