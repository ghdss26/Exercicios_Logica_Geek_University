
/*
 * Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve 
 * executar os seguintes passos 
 * 
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, -2, 5, 7. 
 * (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] 
 * do vetor e mostre na tela esta soma. 
 * 
 * (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
 * 
 * (d) Mostre na tela cada valor do vetor A, um em cada linha. 
 * 
 */

package Vetores_04;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[6];
		int soma;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			A[i] = sc.nextInt();
			
			A[4] = 100;
		}
		
		System.out.println("Posição 1: " + A[0]);
		System.out.println("Posição 2: " + A[1]);
		System.out.println("Posição 5: " + A[5]);
		
		soma = A[0] + A[1] + A[5]; 
		
		System.out.println("Somátorio: " + soma);
		
		System.out.println("Posição 4: " + A[4]);
 	}

}
