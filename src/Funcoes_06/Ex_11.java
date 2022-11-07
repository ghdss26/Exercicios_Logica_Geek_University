package Funcoes_06;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0; 
		double notas = 0; 
		
		System.out.println("1 - Média Aritmética \n");
		System.out.println("2 - Média Ponderada \n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma Opção: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 1: 
			
			A(notas);
			
			break;
			
		case 2: 
			
			P(notas);
			break; 
		}
	}

	private static void A(double notas) {
		
		int i;
		double soma = 0, media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < 3; i++) {
			
			System.out.printf("Informe a %d nota do Aluno: ", i);
			notas = sc.nextDouble();
		}
		
		for(i = 0; i < 3; i++) {
			
			soma += notas; 
			media = soma / 3; 
		}
		
		System.out.printf("Média das Notas é: %.2f", media);
	}
	
	private static void P(double notas) {
		// TODO Auto-generated method stub
		
		int i;
		double soma = 0, media_p = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < 3; i++) {
			
			System.out.printf("Informe a %d nota do Aluno: ", i);
			notas = sc.nextDouble();
		}
		
		for(i = 0; i < 3; i++) {
			
			soma += notas; 
			media_p = ((5 * notas) + (3 * notas) + (2 * notas) / (notas + notas + notas)); 
		}
		
		System.out.printf("Média das Notas é: %.2f", media_p);
	}
}
