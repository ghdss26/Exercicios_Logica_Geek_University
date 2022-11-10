package Funcoes_06;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		
		int n = 9, p = 0, y = 0, x = 0;  
		
		int cont = 0;
		
		numero_primo(n, p, y, x, cont);

	}

	private static void numero_primo(int n, int p, int y, int x, int cont) {
		
		Scanner sc = new Scanner(System.in); 
		
		//System.out.println("Informe um número: "); 
		//n = sc.nextInt();
		
		if(n > 0) {
			
			p = 1; 
			y = 3; 
			
			while (p < n) {
				
				x = 3; 
				
				while(x < y) {
					
					if(y % x == 0) {
						
						break; 
					}
					
					x = x + 2; 
					
				}
				
				if(x == y) {
					
					p = p + 1;
					
					System.out.println(x);
				
				}
				
				y = y + 2;
				
				cont++;
			}
			
			System.out.println();
			System.out.println("Quantidades Abaixo de N: " + cont);
		}
	}

}
