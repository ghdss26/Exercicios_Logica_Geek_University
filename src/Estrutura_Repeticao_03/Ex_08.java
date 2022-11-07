/*
 * 
 * Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido
 * 
 */

package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		int menor = 0;
		int quant = 0;
		int maior;
		int numero = maior = menor;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe o %d número de sua escolha: ", i); 
			numero = sc.nextInt(); 
			
			quant += 1;
			
			if(quant == 1) {
				
				menor = numero;
				
			} else {
				
				
				if(numero < menor) {
					
					menor = numero;
				}
			}
			
			if(numero > maior) {
				
				maior = menor;
				
			}
			
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
	}

}
