
package Indrotucao_01;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double M, K; 
		
		System.out.println("Informe a distância em quilômetros: ");
		K = sc.nextDouble(); 
		
		M = K / 1.61;
		
		System.out.printf("%.2f Milhas", M);
	}

}
