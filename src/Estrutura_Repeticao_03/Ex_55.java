package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int n, p, y, x;
		boolean primo = false;
		
		System.out.println("informe um número: "); 
		n = sc.nextInt(); 
		
		if(n < 0) {
			
			System.out.println("Número inválido");
			
		} else {
			
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
			}
		}
	}

}
