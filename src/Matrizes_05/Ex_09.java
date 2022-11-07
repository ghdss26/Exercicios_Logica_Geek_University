package Matrizes_05;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = new int[3][3]; 
		
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
				
				if(j < i) {
					
					soma = soma + m[i][j];
				}
			}
			
			System.out.printf("Abaixo Diagonal Principal [%d][%d] = [%d] \n", i, j, soma);
		}
 	}

}
