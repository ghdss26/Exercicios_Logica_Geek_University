package Matrizes_05;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double matA[][] = new double[3][3]; 
		double matB[][] = new double[3][3]; 
		
		Scanner sc = new Scanner(System.in);  
		
		int i, j, l, c; 
		
		for(i = 0; i < matA.length; i++) {
			
			for(j = 0; j < matA.length; j++) {
				
				System.out.printf("Informe %d linha e a %d coluna da Matriz: ", i, j); 
				matA[i][j] = sc.nextDouble(); 
			}
		}
		
		for(l = 0; l < matB.length; l++) {
			
			for(c = 0; c < matB.length; c++) {
				
				matB[l][c] = Math.pow(matA[l][c], 2);
			}
		}
		
		for(l = 0; l < matB.length; l++) {
			
			for(c = 0; c < matB.length; c++) {
				
				System.out.printf("Matriz B = [%d][%d] = [%.2f] \n", l, c, matB[l][c]);
			}
		}
	}

}
