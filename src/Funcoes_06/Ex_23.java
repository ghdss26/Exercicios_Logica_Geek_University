package Funcoes_06;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4; 
		
		triangulo_lateral(n);
	}

	private static void triangulo_lateral(int n) {
		// TODO Auto-generated method stub
		
		int i = 0,j = 0; 
		
		for(i = 1; i <= n; i++) {
			
			for(j = n - i; j >= 1; j--) {
				
				for(j = 1; j <= i; j++) {
					
					System.out.println(" * "); 
				}
				
				System.out.println(" ");
				break;
			}
		}
	}
}
