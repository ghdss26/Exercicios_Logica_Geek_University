package Funcoes_06;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		
		double X = 0, Z = 0; 
		
		double exp = Exponenciacao(X, Z, exp = 1);
	}

	private static double Exponenciacao(double X, double Z, double exp) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		for(i = 0; i < 1; i++) {
			
			System.out.printf("Informe o %d número para o X: ", i);
			X = sc.nextInt(); 
		}
		
		for(i = 0; i < 1; i++) {
			
			System.out.printf("Informe o %d número para o Z: ", i);
			Z = sc.nextInt(); 
			
		}
		
		for(i = 0; i < 1; i++) {
			
			 exp = exp * X + Z;
		}
		
		System.out.printf("Exponenciação: %.2f", exp);
		
		return exp;
	}

}
