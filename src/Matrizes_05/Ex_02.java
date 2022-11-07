package Matrizes_05;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int mat[][] = new int[5][5]; 
		
		for(int i = 0; i < mat.length; i++) {
			
			for(int j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe a %d %d matriz: ", i, j);
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i = 0; i < mat.length; i++) {
			
			System.out.printf("Diagonal [%d] [%d] : [%d] \n" , i, i,  mat[i][i]);
		}
	}

}
