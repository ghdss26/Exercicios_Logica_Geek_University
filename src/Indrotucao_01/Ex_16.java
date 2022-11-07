package Indrotucao_01;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double C, P; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor do comprimento em polegadas: ");
		P = sc.nextDouble(); 
		
		C = P * 2.54; 
		
		System.out.printf("Comprimento em polegadas: %.2f", C);
	}

}
