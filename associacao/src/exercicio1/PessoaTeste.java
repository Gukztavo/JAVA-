package exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Gustavo", "25/04/93", "Masculino", "gustavo@hotmail.com", EstadoCivil.SOLTEIRO,
				"vicente machado", 1024, "centro", "ponta grossa", "PR");
		pessoa1.emitirRelatorio();
		
		pessoa1.getEndereco().setCidade("curitiba");
		
		pessoa1.getEndereco().setLogadouro("BALDUINO");
		
		pessoa1.getEndereco().setNumero(604);
		
		pessoa1.emitirRelatorio();
		
		Pessoa pessoa2 = new Pessoa("maria","17/02/2020","feminino","mariaz@email.com", EstadoCivil.SOLTEIRO,"machado de assis", 1025,"centro","pg","pr");
		
		pessoa2.emitirRelatorio();
	}

}
