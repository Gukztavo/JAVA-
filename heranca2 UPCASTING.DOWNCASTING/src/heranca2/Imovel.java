package heranca2;

public class Imovel {
	protected String endereco;
	protected double valorBase;
	public Imovel(String endereco, double valorBase) {
		super();
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public void imovel ()
	{
		System.out.println(this.endereco+" "+this.valorBase+" " );
		
	}
	
	public void imprimirDados() {
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base : R$ " + this.valorBase);
		
	
	}

}
