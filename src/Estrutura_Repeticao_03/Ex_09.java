/*
 * 
 * Faça um programa que leia um número N e depois imprima os N primeiros números naturais impares.
 * 
 */

package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, aux = 0, vezes = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		if(n != 0) {
			
			if(n % 2 != 0) {
				
				while(aux <= vezes) {
					
					n += 2;
					aux++;
					
					System.out.printf(" Números Naturais [%d] = [%d] \n", aux, n);
				}
			}
		}
	}

}
