/*
 * Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui 
 * 
 */

package Vetores_04;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero = new int[10]; 
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número da posição: ", i);
			numero[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			if(numero[i] % 2 == 0) {
				
				contador++; 
			}
		}
		
		System.out.println("Quantidade de Valores Pares: " + contador);
	}

}
