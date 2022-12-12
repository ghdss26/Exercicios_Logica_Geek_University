package Funcoes_06;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numerador, denominador; 
		
		System.out.println("Informe um numerador: "); 
		numerador = sc.nextDouble(); 
		
		System.out.println("Informe um denominador: "); 
		denominador = sc.nextDouble(); 
		
		simplifica(numerador, denominador);
		
	}

	private static void simplifica(double numerador, double denominador) {
		// TODO Auto-generated method stub
		
		double menor, multiplo = 0;
		int i; 
		
		if(numerador < denominador) {
			
			menor = numerador;
			
		} else {
			
			menor = denominador; 
		}
		
		for(i = 0; i < menor; i++) {
			
			if(numerador % i == 0 &&  denominador % i == 0) {
				
				multiplo = i; 
			}
		}
		
		numerador = numerador / multiplo; 
		denominador = denominador / multiplo; 
		
		System.out.printf("Simplifica: %.2f / %.2f", numerador, denominador);
	}
}
