package Funcoes_06;

import java.util.Scanner;

public class Ex_58 {

	public static void main(String[] args) {
		
		int A[][] = new int[4][4];
		int B[][] = new int[4][4];
		
		int C[][] = new int[4][4];
		
		matriz_A_B(A, B);
		
		matriz_produto_C(A, B, C);
		
	}

	private static void matriz_A_B(int[][] A, int[][] B) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna: Sendo A:  ", i, j);
				A[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < B.length; i++) {
			
			for(j = 0; j < B.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna: Sendo B: ", i, j);
				B[i][j] = sc.nextInt();
			}
		}
	}
	
	private static void matriz_produto_C(int[][] A, int[][] B, int[][] C) {
		
		int i, j = 0;
		
		for(i = 0; i < C.length; i++) {
			
			for(j = 0; j < C.length; j++) {
				
				C[i][j] = A[i][j] * B[i][j];
			}
			
		}
		
		for(i = 0; i < C.length; i++) {
			
			for(j = 0; j < C.length; j++) {
				
				System.out.printf("Multiplicação da Matriz C [%d][%d] = [%d] \n", i, j, C[i][j]);
			}
			
		}
		
	}	
	
}
