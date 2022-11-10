package Funcoes_06;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, atual = 1, p = 0, n;
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		int f = fibonnaci(a, atual, p, n); 
	}

	private static int fibonnaci(int a, int atual, int p, int n) {
		
		for(int i = 0; i < n; i++) {
			
			if(i == n) {
				
				System.out.println(a);
				
			} else {
				
				p = atual + a;
				atual = p; 
				a = atual;
				
				System.out.println(a + ' ');
			}
		}
		
		return a;
	}
}
