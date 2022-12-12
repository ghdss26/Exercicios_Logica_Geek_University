package Funcoes_06;

import java.util.Scanner;

public class Ex_53 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n;
		
		System.out.println("Informe um número: ");
		n = sc.nextInt();
		
		matriz_identidade(n);
		
	}

	private static void matriz_identidade(int n) {
		// TODO Auto-generated method stub
		
		int[][] m = new int[n][n];
		
		for(int i = 1; i < m.length; i++) {
			
			for(int j = 1; i < m.length; i++) {
				
				if(i == j) {
					
					m[i][j] = 1;
				}
				
				System.out.println(m[i][j]);
			}
		
		}
	}
}
