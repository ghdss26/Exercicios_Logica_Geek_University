/*
 * Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores X e Y quaisquer 
 * correspondentes a duas posições no vetor. Ao Final seu programa deverá escrever a soma dos valores 
 * encontrados nas respectivas posições X e Y. 
 * 
 */

package Vetores_04;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[8]; 
		int[] Y = new int[8]; 
		int[] soma = new int[8];
		
		for(int i = 0; i < X.length; i++) {
			
			System.out.printf("Informe o %d número de X: ", i);
			X[i] = sc.nextInt(); 
			
		}
		
		for(int i = 0; i < Y.length; i++) {
			
			System.out.printf("Informe o %d número de Y: ", i); 
			Y[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < X.length; i++) {
			
			
			soma[i] = X[i] + Y[i];
			
			System.out.printf("[%d] = [%d] \n", i , soma[i]);
		}
		
	}

}
