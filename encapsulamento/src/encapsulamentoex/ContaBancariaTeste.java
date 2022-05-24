package encapsulamentoex;

public class ContaBancariaTeste {
	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(2421925, "joao da silva");
		System.out.println(conta1.getCodigo());
		System.out.println(conta1.getTitular());
		
		
		conta1.setTitular("mariaz");
		System.out.println("Novo codigo: "+conta1.getCodigo());
		System.out.println("Novo titular: "+ conta1.getTitular());		
		
	}
}
