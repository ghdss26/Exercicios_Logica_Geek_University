package Indrotucao_01;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double M, H; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor em hectares: "); 
		H = sc.nextDouble(); 
		
		M = H * 100000; 
		
		System.out.printf("A área dos hectares é: %.2f metros", M );
	}	

}
