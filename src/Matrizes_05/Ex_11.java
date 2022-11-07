package Matrizes_05;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int i, j = 0, soma = 1; 
		
		int mat[][] = new int[3][3]; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da matriz: ", i, j); 
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				if(j == i - j - 1) {
					
					soma += soma + mat[i][j];
					
					System.out.printf("Abaixo Diagonal Principal [%d][%d] = [%d] \n", i, j, soma);
				}
			}	
		}
	}
}
