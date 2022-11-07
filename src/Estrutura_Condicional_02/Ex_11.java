package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, soma = 0, resto = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt(); 
		
		if(numero > 0) {
			
			while(numero > 0) {
				
				resto = numero % 10;
				numero = numero / 10; 
				soma = soma + resto; 
			}
			
			System.out.printf("A soma dos números inteiros é: %d", soma);
			
		} else {
			
			System.out.println("Número inválido");
		}
	}
}
