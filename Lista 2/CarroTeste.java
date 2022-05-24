package lista2;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.anoFabricacao = 2022;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";
		carro1.chassi = "00000000000000000";
		carro1.renavam = "11111111111";

		carro2.modelo = "Onix";
		carro2.marca = "Chevrolet";
		carro2.anoFabricacao = 2015;
		carro2.placa = "MNO-9876";
		carro2.cor = "Preto";
		carro2.chassi = "00000000000000000";
		carro2.renavam = "11111111111";
		
		
		carro3.modelo = "Mustang GT500";
		carro3.marca = "Ford";
		carro3.anoFabricacao = 2022;
		carro3.placa = "MUS-2022";
		carro3.cor = "Azul";
		carro3.chassi = "00000000000000000";
		carro3.renavam = "11111111111";
	
		carro1.imprimirDados() ; 
		carro2.imprimirDados();
		carro3.imprimirDados();
		
		
	}
	
}
