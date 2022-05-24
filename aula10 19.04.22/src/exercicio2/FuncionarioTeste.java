package exercicio2;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(123,"joao da silva", "19/04/2022");
		funcionario.atribuirDiaFolga(DiaSemana.QUARTA);
		funcionario.imprimirRelatorio();
		
	}

}
