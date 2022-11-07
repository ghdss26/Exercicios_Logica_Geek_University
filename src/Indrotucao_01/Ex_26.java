package Indrotucao_01;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double H, M; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um valor da área em metros quadrados: "); 
		M = sc.nextDouble(); 
		
		H = M * 0.0001; 
		
		System.out.printf("A área em hectares: %.2f", H); 
		
	}	

}
