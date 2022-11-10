package Funcoes_06;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int j = 0;
		double x = 0;
		double fat = 0; 
		double coshx = 0; 
		
		serie_taylor_coshx(n, j, x, fat, coshx);
	}

	private static void serie_taylor_coshx(int n, int j, double x, double fat, double coshx) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Informe um número para X: "); 
		x = sc.nextDouble(); 
		
		for(n = 0; n < 5; n++) {
			
			fat = 1; 
			
			for(j = n; j >= 0; j--) {
				
				fat *= n; 
			}
			
			coshx = Math.cosh(1 + Math.pow(x, j) / n * fat); 
		}
		
		System.out.printf("cosh(x): %.2f", coshx);
	}

}
