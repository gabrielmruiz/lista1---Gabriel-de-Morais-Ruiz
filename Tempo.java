package lista1;

public class Tempo {
	//Atributos
	private int horas, minutos, segundos;
	
	//Construtores
	public Tempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Tempo(int h, int m, int s) {
		this.horas = h;
		this.minutos = m;
		this.segundos = s;
	}

	//Getters e Setters 
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	//Métodos personalizados
	public void imprimeFormato() {
		System.out.println(this.horas+ ":" +this.minutos+ ":" +this.segundos);
	}
	
	public void subtraiObj() {
		
	}
	
	public void somaObj() {
		
	}
	
}
