package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a, b, c; 
		
		System.out.println("Informe um número para a letra A: "); 
		a = sc.nextInt(); 
		
		System.out.println("Informe um número para a letra B: "); 
		b = sc.nextInt(); 
		
		System.out.println("Informe um número para a letra C: "); 
		c = sc.nextInt(); 
		
		if(a < b) {
			
			if(b < c) {
				
				System.out.println("A ordem é: " + a + " " + b + " " + c); 
				
			} else if(a < c) {
				
				System.out.println("A ordem é: " + a + " " + c + " " + b);
				
			} else { 
				
				System.out.println("A ordem é: " + c + " " + a + " " + b);
			}
			
		} if (b < a) {
			
			if(a < c) {
				
				System.out.println("A ordem é: " + b + " " + a + " " + c); 
				
			} else if(b < c) {
				
				System.out.println("A ordem é: " + b + " " + c + " " + a);
				
			} else {
				
				System.out.println("A ordem é: " + c + " " + b + " " + a);
			}
		}
	}

}
