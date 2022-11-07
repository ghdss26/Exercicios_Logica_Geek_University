package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n, soma = 0, multiplicacao = 0;
		
		for(int i = 0; i < 2; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			n = sc.nextInt(); 
			
			soma += n;
		}
		
		System.out.printf("Somátorio: %.2f \n", soma);
		
		for(int i = 0; i < 2; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			n = sc.nextInt(); 
			
			if(n % 2 != 0) {
				
				multiplicacao = n * n;
			}
		}
		
		System.out.printf("Multiplicação: %.2f", multiplicacao);
	}

}
