package exercicio1;

public enum EstadoCivil {

	SOLTEIRO("Solteiro(a)"),
	CASADO("Casado(a)"),
	DIVORCIADO("Divorciado"),
	VIUVO("Viuvo(a)");
	
	private String estado;
	
	private EstadoCivil(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
	
	
	
}
