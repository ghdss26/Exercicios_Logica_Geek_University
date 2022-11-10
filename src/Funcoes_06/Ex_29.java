package Funcoes_06;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int j = 0;
		double x = 0;
		double fat = 0; 
		double sinhx = 0;
		
		serie_taylor_cosx(n, j, x, fat, sinhx);
	}

	private static void serie_taylor_cosx(int n, int j, double x, double fat, double sinhx) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número para X: "); 
		x = sc.nextDouble(); 
		
		for(n = 0; n < 5; n++) {
			
			fat = 1;
			
			for(j = n; j > 0; j--) {
				
				fat *= n; 
			}
			
			sinhx = Math.sinh((x + Math.pow(x, j)) / (n * fat));
		}
		
		System.out.printf("Sinh(x) = %.2f", sinhx);
	}

}
