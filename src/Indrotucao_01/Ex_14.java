package Indrotucao_01;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double R, G, pi = 3.14; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um ângulo em graus"); 
		G = sc.nextDouble(); 
		
		R = (G * pi) / 180; 
		
		System.out.printf("O ângulo em graus é: %.2f", R);
	}

}
