package heranca;

public class VeiculoTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol","Volks",2020, 5 ,"Gasolina",4);
		Aviao aviao1 = new Aviao("A-380","AIRBUS",2005, 800,"DE aviacao",40);
		
		
		carro1.cablibrarPeneus();
		carro1.abastecer();
		
		aviao1.abastecer();
		aviao1.voar();
	}
}
