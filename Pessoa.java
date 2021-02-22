package lista1;

import java.time.LocalDate;

public class Pessoa {
	//Atributos
	private String nome;
	private float altura;
	private LocalDate nascimento;
	private int idade, anoNascimento;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	//Métodos Personalizados 
	public void status() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Data de nascimento: " +this.nascimento);
		System.out.println("Altura: " +this.altura);
	}
	
	public int calculaIdade(int idade) {
		idade = 2020 - this.anoNascimento;
		return this.idade;
		}
	public void setNascimento(int i, int j, int k) {
	
		
	}
}