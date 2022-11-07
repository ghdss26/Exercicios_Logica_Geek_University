package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double B, A, C, Delta, X, X1; 
		
		System.out.println("Informe o valor de A: ");
		A = sc.nextDouble(); 
		
		System.out.println("Informe o valor de B: ");
		B = sc.nextDouble(); 
		
		System.out.println("Ifnroem o valor de C: ");
		C = sc.nextDouble(); 
		
		Delta = Math.pow(B, 2) - 4 * A * C;
		
		System.out.printf("Delta: %.2f \n", Delta);
		
		X = -B + Math.sqrt(Delta) / 2 * A; 
		
		X1 = -B - Math.sqrt(Delta) / 2 * A; 
		
		if(Delta < 0) {
			
			System.out.println("Não existe raiz"); 
			
		} else if(Delta == 0) {
			
			System.out.println("Raiz Única");
			
		} else if(Delta >= 0) {
			
			System.out.printf("X: %.2f \n", X);
			System.out.printf("X1: %.2f \n", X1);
		}
		
	}

}
