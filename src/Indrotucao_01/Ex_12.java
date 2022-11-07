package Indrotucao_01;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double M, K;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a distância em quilômetros quadrados: "); 
		M = sc.nextDouble(); 
		
		K = 1.61 * M;
		
		System.out.printf("%.2f m", K);
	}

}
