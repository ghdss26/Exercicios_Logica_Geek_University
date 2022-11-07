package Indrotucao_01;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double L, M;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor de volume em metros cúbicos: ");
		M = sc.nextDouble(); 
		
		L = 1000 * M; 
		
		System.out.printf("O Volume em Litros é: %.2f Litros", L);
	}

}
