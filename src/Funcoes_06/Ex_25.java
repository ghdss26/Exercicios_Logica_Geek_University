package Funcoes_06;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0; 
		
		double n = 0, s = 0;
		
		funcao_conta(i, n, s);
	}

	private static void funcao_conta(int i, double n, double s) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		n = sc.nextDouble(); 
		
		for(i = 0; i < n; i++) {
			
			s = (i + n / i) + (Math.pow(n, 2) / n - 3);
		}
		
		System.out.printf("Resultado: %.2f", s);
	}

}
