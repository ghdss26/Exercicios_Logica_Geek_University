package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1 - Adição: \n");
		System.out.println("2 - Subtração: \n");
		System.out.println("3 - Multiplicação: \n"); 
		System.out.println("4 - Divisão: \n"); 
		
		Scanner sc = new Scanner(System.in); 
		
		int opcao; 
		
		System.out.println("Informe a opção: "); 
		opcao = sc.nextInt(); 
		
		switch(opcao) {
		
		case 1: 
			
			double n = 0; 
			
			for(int i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i); 
				n = sc.nextInt(); 
			} 
			
			for(int i = 0; i < 1; i++) {
				
				double soma = 0; 
				
				soma = n + n; 
				
				System.out.println(soma);
			}
			
			break;
			
		case 2: 
			
			double n2 = 0; 
			
			for(int i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i); 
				n2 = sc.nextInt(); 
			} 
			
			for(int i = 0; i < 1; i++) {
				
				double subtracao = 0; 
				
				subtracao = n2 - n2; 
				
				System.out.println("Subtração: " + subtracao);
			}
			
			break;
			
		case 3:
			
			double n3 = 0; 
			
			for(int i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i); 
				n3 = sc.nextInt(); 
			} 
			
			for(int i = 0; i < 1; i++) {
				
				double multiplicao = 0; 
				
				multiplicao = n3 * n3; 
				
				System.out.println("Subtração: " + multiplicao);
			}
			
			break;
			
		case 4:
			
			double n4 = 0; 
			
			for(int i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i); 
				n3 = sc.nextInt(); 
			} 
			
			for(int i = 0; i < 1; i++) {
				
				double divisao = 0; 
				
				divisao = n4 / n4; 
				
				System.out.println("Subtração: " + divisao);
			}
			
			
		}
		
	}
}
