package Funcoes_06;

import java.util.Scanner;

public class Ex_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = new int[3][3]; 
		
		diagonal_principal(m);
	}

	private static void diagonal_principal(int[][] m) {
		
		int i, j, soma = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna: ", i, j); 
				m[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				if(i == j) {
					
					soma = soma + m[i][j];
				}
			}
			
			System.out.printf("Diagonal Principal [%d][%d] = [%d] \n", i, j, soma);
		}
	}

}
