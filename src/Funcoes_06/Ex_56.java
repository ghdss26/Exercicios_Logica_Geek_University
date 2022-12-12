package Funcoes_06;

import java.util.Scanner;

public class Ex_56 {

	public static void main(String[] args) {
		
		int A[][] = new int[7][6];
		
		System.out.println("Soma dos números de Linhas: " + matriz_soma(A));

	}

	private static int matriz_soma(int[][] A) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, soma = 0; 
		
		int n1;
		
		System.out.println("Informe um número: ");
		n1 = sc.nextInt();
		
		for(i = 0; i < 7; i++) {
			
			for(j = 0; j < 6; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da matriz: ", i, j);
				A[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < 6; i++) {
			
			soma = A[i][i] + n1;
		}
		
		
		return soma;
	}
}
