package Funcoes_06;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14; 
		double x = 0; 
		double fat = 0; 
		int n = 0; 
		int j = 0;
		double senx = 0;
		
		Serie_Taylor(x, n, fat, j, senx);
	}

	private static void Serie_Taylor(double x, int n, double fat, int j, double senx) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		x = sc.nextDouble(); 
		
		for(n = 0; n < 5; n++) {
			
			fat = 1;
			
			for(j = n; j > 0; j--) {
				
				fat *= n; 
			}
			
			senx = Math.sin((x - Math.pow(x, j)) / (n * fat));
		}
		
		System.out.printf("Sen(x): %.2f", senx);
	}
}
