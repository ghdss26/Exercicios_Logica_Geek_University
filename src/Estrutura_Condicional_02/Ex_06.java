/*
 * Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles. 
 * assim como a diferença existente entre ambos. 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2;
		int diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		n1 = sc.nextInt(); 
		
		System.out.println("Informe o segundo número: "); 
		n2 = sc.nextInt(); 
		
		if(n1 > n2) {
			
			diferenca = n1 - n2;
			
			System.out.println("O " + n1 + " é maior que: " + n2);
			System.out.println("A diferença: " + diferenca);
			
		} else {
			
			diferenca = n2 - n1;
			
			System.out.println("O " + n1 + " é menor que: " + n2);
			System.out.println("A diferença: " + diferenca);
		}
		 
		
	}

}
