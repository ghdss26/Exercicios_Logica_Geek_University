package Funcoes_06;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b; 
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Informe o valor de A: ");
		a = sc.nextDouble(); 
		
		System.out.println("Informe o valor de B: ");
		b = sc.nextDouble(); 
		
		hipotenusa(a, b);
	}

	private static void hipotenusa(double a, double b) {
		
		double h = 0; 
		
		h = Math.hypot(a, b);
		
		System.out.printf("Hipotenusa: %.2f", h); 
	}

}
