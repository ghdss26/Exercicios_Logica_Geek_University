package Funcoes_06;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		String simbolo = " "; 
		
		double numero = 0;  
		
		double op = operacao(simbolo, numero);
	}

	private static double operacao(String simbolo, double numero) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		double soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0 ;
		
		System.out.println("+ - Adição");
		System.out.println("- - Subtração");
		System.out.println("* - Multiplicação");
		System.out.println("/ - Divisão");
		
		System.out.println("Informe um símbolo: ");
		simbolo = sc.next(); 
		
		if(simbolo.equalsIgnoreCase("+")) {
			
			for(i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble();
				
				soma += numero;
			}
			
			System.out.printf("O Somátorio é de: %.2f", soma);
			
		} else if(simbolo.equalsIgnoreCase("-")) {
			
			for(i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble();
				
				subtracao -= numero;
			}
			
			System.out.printf("O Subtracao é de: %.2f", subtracao);
			
		} else if(simbolo.equalsIgnoreCase("*")) {
			
			for(i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble();
				
				multiplicacao = numero * numero;
			}
			
			System.out.printf("A multiplicação é de: %.2f", subtracao);
			
		} else if(simbolo.equalsIgnoreCase("/")) {
			
			for(i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble();
				
				divisao = numero / 2;
			}
			
			System.out.printf("A divisão é de: %.2f", divisao);
			
		}
		
		return 0;
	}

}
