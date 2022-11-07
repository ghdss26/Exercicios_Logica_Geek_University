/**
 * 
 * Faça um programa que receba dois números e mostre o maior. Se por acaso, os dois números forem iguais, 
 * imprima a mensagem Números iguais 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Informe o primeiro número: "); 
		n1 = sc.nextInt(); 
		
		System.out.println("Informe o segundo número: "); 
		n2 = sc.nextInt(); 
		
		if(n1 == n2) {
			
			System.out.println("Números iguais. "); 
			
		} else if(n1 > n2) {
			
			System.out.println("O " + n1 + " é > que " + n2); 
			
		} else if(n1 < n2) {
			
			System.out.println("O " + n1 + " é < que " + n2); 
		}
	}

}
