package Orientacao_Objeto_Pessoa_1_9;

import java.util.Scanner;

public class Pessoa {

	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int idade;
	private double altura;
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public int getIdade() {
		
		return idade;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
	public double getAltura() {
		
		return altura;
	}
	
	public void setAltura(double altura) {
		
		this.altura = altura;
	}
	
	public void imprimir() {
		
		setNome("Gustavo"); 
		setIdade(26);
		setAltura(1.80);
		
		System.out.println("Nome: " + getNome() + " " + "Idade: " + getIdade() + " " + "Altura: " + getAltura()); 
	}
	
}
