package Funcoes_06;

import java.util.Scanner;

public class Ex_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = new int[4][4]; 
		
		maior_10(mat);
	}

	private static void maior_10(int[][] mat) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i, j; 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe o [%d] [%d] número da matriz: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				if(mat[i][j] > 10) {
					
					System.out.printf("Número na matriz maior do que 10: [%d][%d] = [%d] \n", i, j, mat[i][j]);
				}
			}
		}
	}

}
