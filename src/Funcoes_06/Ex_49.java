package Funcoes_06;

import java.util.Scanner;

public class Ex_49 {

	public static void main(String[] args) {
		
		int m[][] = new int[3][3]; 
		
		abaixo_diagonal_principal(m);
		
	}

	private static void abaixo_diagonal_principal(int[][] m) {
		
		Scanner sc = new Scanner(System.in); 
		
		int i, j, soma = 0; 
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna: ", i, j);
				m[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				if(j < i) {
					
					soma = soma + m[i][j];
				}
			}
			
			System.out.printf("Abaixo Diagonal Principal [%d][%d] = [%d] \n", i, j, soma);
		}
	}

}
