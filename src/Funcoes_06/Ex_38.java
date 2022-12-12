package Funcoes_06;

import java.util.Scanner;

public class Ex_38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, k; 
		
		System.out.println("Informe um número para n: "); 
		n = sc.nextInt(); 
		
		System.out.println("Informe um número para k: "); 
		k = sc.nextInt(); 
		
		interna(n, k);
		System.out.println("Fatorial Exponencial: " + exponencial(n));
		
	}

	private static int interna(int n, int k) {
		
		if(k == 1) {
			
			return 0; 
		}
		
		return interna(n * interna(n, k - 1), k - 1);	
	}

	private static int exponencial(int n) {
		
		if(n == 0) {
			
			return 0;
			
		}
		
		if(n == 1 || n == 2) {
			
			return n;
		}
		
		return interna(n, n - 1);
	}

}
