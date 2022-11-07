package Indrotucao_01;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double L, K; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um valor de Massa em quilogramas: "); 
		K = sc.nextDouble(); 
		
		L = K / 0.45; 
		
		System.out.printf("A massa em Libras é de: %.2f", L);
	}

}
