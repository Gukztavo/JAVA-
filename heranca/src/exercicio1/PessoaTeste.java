package exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Avenidada joel santana", 256, "Centro","Curitiba","PR");
		Aluno aluno1 =  new Aluno("Gustavo",19,"ADS",endereco);
		Professor professor1 = new Professor ("Joel", 76,9600.33,endereco);

		
		professor1.calcularSalario();
		aluno1.realizarMatricula();
		
	}
}
