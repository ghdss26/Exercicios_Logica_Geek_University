package Matrizes_05;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double matA[][] = new double[3][3]; 
		double matB[][] = new double[3][3]; 
		
		double matC[][] = new double[3][3]; 
		
		int i, j;
		
		for(i = 0; i < matA.length; i++) {
			
			for(j = 0; j < matA.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da Matriz: ", i, j); 
				matA[i][j] = sc.nextDouble();
			}
		}
		
		for(i = 0; i < matB.length; i++) {
			
			for(j = 0; j < matB.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da Matriz: ", i, j); 
				matB[i][j] = sc.nextDouble();
			}
		}
		
		for(i = 0; i < matC.length; i++) {
			
			for(j = 0; j < matC.length; j++) {
				
				matC[i][j] = matA[i][j] * matB[i][j];
			}
		}
		
		for(i = 0; i < matC.length; i++) {
			
			for(j = 0; j < matC.length; j++) {
				
				System.out.printf("Multiplicação da Matriz C [%d][%d] = [%.2f] \n", i, j, matC[i][j]);
			}
		}
	}

}
