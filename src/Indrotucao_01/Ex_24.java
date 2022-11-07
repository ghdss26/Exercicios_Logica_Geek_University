package Indrotucao_01;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double M, A; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor em metros quadrados: ");
		M = sc.nextDouble(); 
		
		A = M * 0.000247; 
		
		System.out.printf("A área em Acres: %.2f A", A);
	}

}
