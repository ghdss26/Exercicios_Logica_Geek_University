package Funcoes_06;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int j = 0;
		double x = 0;
		double fat = 0; 
		double nep = 0; 
		
		valor_neperiano(n, j, x, fat, nep);
	}

	private static void valor_neperiano(int n, int j, double x, double fat, double nep) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Informe um número para X: "); 
		x = sc.nextDouble(); 
		
		for(n = 0; n < 5; n++) {
			
			fat = 1; 
			
			for(j = n; j >= 0; j--) {
				
				fat *= n; 
			}
			
			nep = Math.log(x / n * fat);
		}
		
		System.out.printf("Neperiano: %.2f", nep);
	}

}
