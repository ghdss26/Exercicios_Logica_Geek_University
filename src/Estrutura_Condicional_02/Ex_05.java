/*
 * Faça um programa que receba um número inteiro e verifique se este número é para ou impar 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt();
		
		if(numero % 2 == 0 ) {
			
			System.out.println("O " + numero + " é par");
			
		} else {
			
			System.out.println("O " + numero + " é impar");
		}
	}

}
