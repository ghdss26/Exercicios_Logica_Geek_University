package Funcoes_06;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14; 
		double x = 0; 
		int n = 0; 
		int j = 0;  
		double fat = 0;
		double cosx = 0; 
		
		Serie_Taylor_cosx(pi, x, n, j, cosx, fat);
		
	}

	private static void Serie_Taylor_cosx(double pi, double x, int n, int j, double cosx, double fat) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		x = sc.nextDouble(); 
		
		for(n = 0; n < 5; n++) {
			
			fat = 1; 
			
			for(j = n; j > 0; j--) {
				
				fat *= n; 
			}
			
			cosx = Math.cos((x + Math.pow(x, j)) / (n * fat));
		}
		
		System.out.printf("Cos(x): %.2f", cosx);
	}
}
