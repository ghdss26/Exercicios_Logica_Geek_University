package Indrotucao_01;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double K, L; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um valor de massa em libra: "); 
		L = sc.nextDouble(); 
		
		K = L * 0.45;
		
		System.out.printf("A massa em quilogramas é: %.2f", K);
	}

}
