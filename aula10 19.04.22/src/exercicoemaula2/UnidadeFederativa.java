package exercicoemaula2;

public enum UnidadeFederativa {
	
	SP("São Paulo", "SP", "São Paulo"),
    RJ("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    MG("Minas Gerais", "MG", "Belo Horizonte"),
    ES("Espírito Santo", "ES", "Vitória"),
    PR("Paraná", "PR", "Curitiba"),
    SC("Santa Catarina", "SC", "Florianópolis"),
    RS("Rio Grande do Sul", "RS", "Porto Alegre");
	
	private String nome;
	private String sigla;
	private String capital;
	
	private UnidadeFederativa(String nome, String sigla,String capital) {
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getCapital() {
		return capital;
	}
    
}
