package Funcoes_06;

import java.util.Scanner;

public class Ex_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int n;
		int j;
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		System.out.println("Informe um número para o j: ");
		j = sc.nextInt();
		
		interna(n, j);
		System.out.println("Hiperfatorial: " + hiperfatorial(n));
		
	}

	private static long interna(int n, int j) {
		
		if(j == 1) {
			
			return n;
		}
		
		return n * interna(n, j - 1);
	}

	private static int hiperfatorial(int n) {
		
		if(n == 1 || n == 0) {
			
			return 1;
		}
		
		return (int) (interna(n, n) * hiperfatorial(n - 1));
	}

}
