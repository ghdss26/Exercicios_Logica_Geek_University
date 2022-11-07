package Matrizes_05;

import java.util.Random;
import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j; 
		
		Random rand = new Random(); 
		
		int mat[][] = new int[4][4]; 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				if(j < i) {
					
					mat[i][j] = 0;
					mat[i][j] = rand.nextInt(20) % 20 + 1;
				}
			}
		}
		
		System.out.println("Elementos acima da Diagonal Principal: ");
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Leitura da linha e a coluna é = [%d][%d] = [%d] \n", i, j, mat[i][j]);
			}
		}
	}

}
