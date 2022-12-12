package Funcoes_06;

import java.util.Scanner;

public class Ex_55 {

	public static void main(String[] args) {
	
		int A[][] = new int[3][3]; 
		
		System.out.println("Soma da Diagonal Principal: " + Diagonal_Principal(A));
		System.out.println("Soma da Diagonal Secundária: " + Diagonal_Secundaria(A));
		
	}

	private static int Diagonal_Secundaria(int[][] A) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, soma = 0; 
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				System.out.printf("Informe o %d número da linha e o %d número da coluna: ", i, j);
				A[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				if(j == i - j - 1) {
					
					soma += soma + A[i][j];
					
				}
			}	
		}
		
		return soma;
	}

	private static int Diagonal_Principal(int[][] A) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, soma = 0; 
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				System.out.printf("Informe o %d número da linha e o %d número da coluna: ", i, j);
				A[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				if(i == j) {
					
					soma = soma + A[i][j];
					
				}
			}
		}
		
		return soma;
	}

}
