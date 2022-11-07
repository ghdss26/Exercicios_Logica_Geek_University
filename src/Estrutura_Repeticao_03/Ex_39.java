package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b, h, t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura do triângulo: "); 
		h = sc.nextDouble(); 
		
		System.out.println("Informe a base do triângulo: ");
		b = sc.nextDouble(); 
		
		for(int i = 0; i < 1; i++) {
			
			t = (b * h) / 2; 
			
			if(t > 0) {
				
				System.out.printf("A área do Triângulo é: %.2f", t);
			}
		}
	}

}
