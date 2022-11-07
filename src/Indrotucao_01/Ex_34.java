package Indrotucao_01;

import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raio, area, pi = 3.14; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio de um círculo: "); 
		raio = sc.nextDouble(); 
		
		area = pi * Math.pow(raio, 2); 
		
		System.out.printf("A Aŕea do círculo é: %.2f", area);
	}

}
