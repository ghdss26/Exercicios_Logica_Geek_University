/* 
 * Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos;
 * 
 */

package Vetores_04;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero = new int[7]; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero[i] = sc.nextInt();
		}
		
		System.out.println("Número 1: " + numero[0]);
		System.out.println("Número 2: " + numero[1]);
		System.out.println("Número 3: " + numero[2]);
		System.out.println("Número 4: " + numero[3]);
		System.out.println("Número 5: " + numero[4]);
		System.out.println("Número 6: " + numero[5]);
		System.out.println("Número 7: " + numero[6]);
	}

}
