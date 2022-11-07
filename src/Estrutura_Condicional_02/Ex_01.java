/*
 * 
 * Faça um programa que receba dois números e mostre qual o maior deles; 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: "); 
		n1 = sc.nextInt(); 
		
		System.out.println("Informe o Segundo número: "); 
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			
			System.out.println("O Maior número é: " + n1);
			
		} else {
			
			System.out.println("O Maior número é: " + n2);
		}
		
	}

}
