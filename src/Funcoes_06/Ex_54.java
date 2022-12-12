package Funcoes_06;

import java.util.Scanner;

public class Ex_54 {

	public static void main(String[] args) {
		
		int A[][] = new int[4][4];
		
		System.out.println(Soma_elementos(A));

	}

	private static int Soma_elementos(int[][] A) {
		
		Scanner sc = new Scanner(System.in); 
		
		int i, j, soma = 0; 
		
		int cont = 0;
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				System.out.printf("Informe o %d número da linha e o %d número da coluna: ", i, j);
				A[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				if(A[i][j] > 0) {
					
					soma += A[i][j]; 
					
				}
			}
		}
		
		return soma;
	}

}
