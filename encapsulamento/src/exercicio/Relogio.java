package exercicio;

public class Relogio {

	int hora;
	int minutos;
	String marca;

	public Relogio(int hora, int minutos, String marca) {
		this.hora = hora;
		this.marca = "marca";
		this.minutos = minutos;
		
		
	}

	public int getHora() {
		
		return hora;
	}

	public void setHora(int hora) {
		if(hora >=0 && hora <= 23) { 
		this.hora = hora;
		}else {
			System.out.println("hora incorreta");
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String getMarca() {
		return marca;
	}
}
