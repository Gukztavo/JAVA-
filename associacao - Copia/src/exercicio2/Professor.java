package exercicio2;

public class Professor {
	private int registro;
	private String nomeProfessor;
	private String dataNascimento;
	private double salario;

	public Professor(int registro, String nomeProfessor, String dataNascimento, double salario) {
		super();
		this.registro = registro;
		this.nomeProfessor = nomeProfessor;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
