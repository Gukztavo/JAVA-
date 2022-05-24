package exercicoemaula2;

public enum UnidadeFederativa {
	
	SP("S�o Paulo", "SP", "S�o Paulo"),
    RJ("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    MG("Minas Gerais", "MG", "Belo Horizonte"),
    ES("Esp�rito Santo", "ES", "Vit�ria"),
    PR("Paran�", "PR", "Curitiba"),
    SC("Santa Catarina", "SC", "Florian�polis"),
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
