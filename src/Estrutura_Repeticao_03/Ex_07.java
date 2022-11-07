/*
 * 
 * Faça um programa que leia 10 inteiros positivos, ignorando não positivos, e imprima sua média
 * 
 */

package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, soma = 0, media = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero = sc.nextInt(); 
			
			if(numero > 0) {
				
				soma += numero; 
				media = soma / 10;
				
			}
		}
		
		System.out.println("Media: " + media);
	}

}
