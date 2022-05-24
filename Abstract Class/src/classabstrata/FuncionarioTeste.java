package classabstrata;

public class FuncionarioTeste{
	public static void main(String[] args) {
		Horista horista1 =  new Horista ("Fulano",999999999,2500.00,25.0,20);
		System.out.println("Salario Horista : "+horista1.calcularSalario());
		horista1.calcularSalario();
		
		Comissionado comissionado1 = new Comissionado("Ronaldo", 888888,3000.00,1000.00,0.10);
		System.out.println("Salario Comissado : "+comissionado1.calcularSalario());
	
		
		Assalariado assalariado1 = new Assalariado ("Cristiano",77777777,1000.00,500.00);
		System.out.println("Salaria Assalariado : R$: "+ assalariado1.calcularSalario());
		
		
		
	}
}
