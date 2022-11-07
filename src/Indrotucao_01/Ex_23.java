package Indrotucao_01;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float J, M; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor do comprimento em metros quadrados: ");
		M = sc.nextFloat(); 
		
		J = (float) ((float) M / 0.91);
		
		System.out.printf("Comprimento em Jardas: %.2f", J);
	}

}
