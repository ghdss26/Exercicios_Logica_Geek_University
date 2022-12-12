package Funcoes_06;

import java.util.Scanner;

public class Ex_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = new int[3][3];
		
		acima_diagonal_principal(mat);
	}

	private static void acima_diagonal_principal(int[][] mat) {
		
		int i, j, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna: ", i, j); 
				mat[i][j] = sc.nextInt(); 
				
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = i + 1 ; j < mat.length; j++) {
				
				if (j > i) {
					
					soma += mat[i][j];
				}
				
				System.out.printf("Acima da Diagonal Principal:  [%d] [%d] : [%d] \n" , i, j, soma);
			}
			
		}
	}
}
