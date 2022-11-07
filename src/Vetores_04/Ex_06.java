/*
 * 
 * Faça um programa que receba do usuário um vetor com 10 posições. Em seguida deverá ser impresso 
 * o maior e o menor elemento do vetor 
 * 
 */

package Vetores_04;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		double[] numero = new double[10]; 
		
		double n, maior = 0, menor = 0, quant = 0, soma = 0; 
		
		soma = quant = maior = menor = 0; 
		
		for(int i = 0; i < numero.length; i++) {
			
			n = numero[i]; 
			
			System.out.printf("Informe o %d número: ", i); 
			n = sc.nextDouble(); 
			
			soma += n;
			quant += 1;
			
			if(quant == 1) {
				
				maior = menor = n;
				
			} else {
				
				if(n > maior) {
					
					maior = n; 
				}
				
				if(n < menor) {
					
					menor = n; 
				}
			}
		}
		
		System.out.printf("Maior número: %.2f \n", maior);
		System.out.printf("Menor número: %.2f \n", menor);
		
	}

}
