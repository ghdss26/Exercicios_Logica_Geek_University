/*
 * Faça um programa que peça ao usuário para digitar 10 valores e some-os. 
 * 
 */

package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_05 {
	
	public static void main(String[] args) {
		
		int numero = 10, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe o %d número para somar: ", i);
			numero = sc.nextInt(); 
			
			soma += numero
					;
		}
		
		System.out.println(soma);
	}
}
