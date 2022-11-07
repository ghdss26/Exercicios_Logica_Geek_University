package Indrotucao_01;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double M, L; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor de volume em litros: "); 
		L = sc.nextDouble(); 
		
		M = L / 1000; 
		
		System.out.printf("Volume em metros cúbicos é: %.2f", M);
	}

}
