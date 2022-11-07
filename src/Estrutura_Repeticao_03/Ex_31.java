package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n = 1, s = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número: ");
		n = sc.nextDouble(); 
		
		for(int i = 1; i < 50; i++) {
			
			s = s + n / i; 
			n = n + 2;
		}
		
		System.out.printf("Sequência: %.2f", s);
	}

}
