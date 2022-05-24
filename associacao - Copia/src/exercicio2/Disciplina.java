package exercicio2;

public class Disciplina {
	private int codigo;
	private String nome;
	private Modalidade modalidade;
	private int cargaHoraria;

	private Professor professor;

	public Disciplina(int codigo, String nome, Modalidade modalidade, int cargaHoraria, int registro,
			String nomeProfessor, String dataNascimento, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = new Professor(registro, nomeProfessor, dataNascimento, salario);
	}

	public void emitirRelatorio() {
		System.out.println("=================RELATÓRIO===================");
		System.out.println("Codigo Disciplina: " + this.codigo);
		System.out.println("Nome Disciplina: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade.getModalidade());
		System.out.println("Carga Horario: " + this.cargaHoraria + " Horas");
		System.out.println("Nome professor: " + this.professor.getNomeProfessor());
		System.out.println("Registro: " + this.professor.getRegistro());
		System.out.println("Data de Nascimento: " + this.professor.getDataNascimento());
		System.out.println("Salario R$:" + this.professor.getSalario() + " Reais ");

	}
}
