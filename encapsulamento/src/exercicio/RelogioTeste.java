package exercicio;

public class RelogioTeste {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio (0,0,"Lanchar");
		System.out.println(relogio1.getHora());
		System.out.println(relogio1.getMinutos());
		
		relogio1.setHora(-1);
		System.out.println(relogio1.getHora());
	}
	
}

