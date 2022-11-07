package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double h = 0; 
		
		int i, n; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt();
		
		for(i = n; i >= 1; i = i - 1) {
			
			h = h + 1.0 / i;
		}
		
		System.out.printf("Harmônica: %.2f", h);
	}

}
