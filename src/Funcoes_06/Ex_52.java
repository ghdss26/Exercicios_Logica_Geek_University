package Funcoes_06;

import java.util.Scanner;

public class Ex_52 {

	public static void main(String[] args) {
		
		int mat[][] = new int[4][4];
		
		matriz_tranposta(mat);

	}

	private static void matriz_tranposta(int[][] mat) {
		
		int i, j; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna: ", i, j); 
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Leitura da Matriz: [%d][%d] = [%d] \n", i, j, mat[i][j]); 
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				mat[j][i] = mat[i][j]; 
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Leitura da Matriz Transposta: [%d][%d] = [%d] \n", i, j, mat[j][i]); 
			}
		}
		
	}

}
