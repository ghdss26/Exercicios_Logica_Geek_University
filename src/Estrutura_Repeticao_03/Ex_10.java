/**
 * 
 * Faça um programa que calcule e mostre a soma dos 50 primeiros números pares. 
 * 
 */

package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int n; 
		int soma = 0;
		
		for(i = 0; i < 50; i++) {
			
			soma += i;
		}
		
		System.out.println(soma);
	}

}
