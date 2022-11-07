package Indrotucao_01;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double P, C; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o comprimento em centímetros: ");
		C = sc.nextDouble(); 
		
		P = C / 2.54; 
		
		System.out.printf("O Comprimento em polegadas é: %.2f", P); 
	}

}
