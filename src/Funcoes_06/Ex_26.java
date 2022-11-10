package Funcoes_06;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n = 0, soma = 0; 
		
		double s = somatorio(n, soma);
	}

	private static double somatorio(double n, double soma) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0; 
		
		System.out.println("Informe um número: "); 
		n = sc.nextDouble();
		
		for(i = 1; i < n; i++) {
			
			if(n > 0) {
				
				soma += i; 
				
				System.out.println(soma);
			}
		}
		
		return soma;
	}

}
