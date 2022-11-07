package Matrizes_05;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j; 
		
		int mat[][] = new int[4][4]; 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				mat[i][j] = i * j;
			}
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Matriz Linha e Coluna [%d] [%d] = [%d] \n", i, j, mat[i][j]);
			}
		}
	}
}
