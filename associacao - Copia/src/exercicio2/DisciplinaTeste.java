package exercicio2;

public class DisciplinaTeste {
	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina(15124, "Matematica", Modalidade.DISTANCIA, 25, 25874, "Francisco",
				"17/02/2020", 958.25);
		disciplina1.emitirRelatorio();
	}
}
