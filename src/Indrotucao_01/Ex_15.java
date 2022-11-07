package Indrotucao_01;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double G, R, pi = 3.14; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um ângulo em radianos: ");
		R = sc.nextDouble(); 
		
		G = (R * 180) / pi; 
		
		System.out.printf("O ângulo em graus: %.2f", G);
	}

}
