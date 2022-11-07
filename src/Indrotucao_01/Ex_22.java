package Indrotucao_01;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float J, M; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do comprimento em jardas: "); 
		M = sc.nextFloat(); 
		
		J = (float) (M / 0.91);  
		
		System.out.printf("Comprimento em Metros: %.2f metros", J);
	}

}
