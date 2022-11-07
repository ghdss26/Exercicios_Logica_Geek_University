package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um lado A: ");
		a = sc.nextInt(); 
		
		System.out.println("Informe um lado B: ");
		b = sc.nextInt(); 
		
		System.out.println("Informe um Lado C: "); 
		c = sc.nextInt(); 
		
		if(a + b > c && b + c > a && c + a > b) {
			
			if(a == b || b == c) {
				
				System.out.println("Equilátero"); 
				
			} else if(a == b || b == c || c == a) {
				
				System.out.println("Isósceles");
				
			} else {
				
				System.out.println("Escaleno");
			}
			
		} else {
			
			System.out.println("Valores não formam um triângulo");
		}
	}

}
