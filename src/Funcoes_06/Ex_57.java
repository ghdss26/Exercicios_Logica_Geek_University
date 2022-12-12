package Funcoes_06;

import java.util.Scanner;

public class Ex_57 {

	public static void main(String[] args) {
		
		int A[][] = new int[7][6];
		
		System.out.println("Soma das Colunas: " + soma_matriz_coluna(A));
	}

	private static int soma_matriz_coluna(int[][] A) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, soma = 0; 
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		for(i = 0; i < 7; i++) {
			
			for(j = 0; j < 6; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da matriz: ", i, j);
				A[i][j] = sc.nextInt();  
			}
		}
		
		for(i = 0; i < 7; i++) {
			
			for(j = 0; j < 6; j++) {
				
				soma += A[i][j] + n;
			}
		}
		
		return soma;
	}

}
