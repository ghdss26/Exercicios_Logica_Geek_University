package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota;
		int faltas; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a nota do aluno: "); 
		nota = sc.nextDouble(); 
		
		System.out.println("Informe o número de faltas: "); 
		faltas = sc.nextInt(); 
		
		// Primeira parte da tabela 
		if(nota >= 9.0 && nota <= 10 && faltas <= 20) {
			
			System.out.println("Conceito A"); 
			
		} else if(nota >= 7.5 && nota <= 8.9 && faltas <= 20) {
			
			System.out.println("Conceito B"); 
			
		} else if(nota >= 5.0 && nota <= 7.4 && faltas <= 20) {
			
			System.out.println("Conceito C"); 
			
		} else if(nota >= 4.0 && nota <= 4.9 && faltas <= 20) {
			
			System.out.println("Conceito D"); 
			
		} else if(nota >= 0.0 && nota <= 3.9 && faltas <= 20) {
			
			System.out.println("Conceito E");
		}
		
		// Segunda parte da tabela 
		if(nota >= 9.0 && nota <= 10 && faltas > 20) {
			
			System.out.println("Conceito B"); 
			
		} else if(nota >= 7.5 && nota <= 8.9 && faltas >= 21) {
			
			System.out.println("Conceito C"); 
			
		} else if(nota >= 5.0 && nota <= 7.4 && faltas >= 21) {
			
			System.out.println("Conceito D"); 
			
		} else if(nota >= 4.0 && nota <= 4.9 && faltas >= 21) {
			
			System.out.println("Conceito E"); 
			
		} else if(nota >= 0.0 && nota <= 3.9 && faltas >= 21) {
			
			System.out.println("Conceito F");
		}
	}

}
