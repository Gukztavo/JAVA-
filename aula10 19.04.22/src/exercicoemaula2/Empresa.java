package exercicoemaula2;

public class Empresa {
	private String razao;
	private int cnpj;
	private UnidadeFederativa UniF;

	public Empresa(String razao, int cnpj) {
		this.razao = razao;
		this.cnpj = cnpj;
	}

	public void UniF(UnidadeFederativa UniF) {
		this.UniF = UniF;
		
		
	}

	public void imprimirRelatorio() {
		System.out.println("Razao: " +this.razao);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Unidade Federativa: "+this.UniF.getCapital());
		System.out.println("Estado: " +this.UniF.getSigla()); 
		
		
	}
	
}
