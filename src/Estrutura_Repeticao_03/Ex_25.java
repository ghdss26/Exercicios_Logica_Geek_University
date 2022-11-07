package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		for(int i = 1; i < n; i++) {
			
			if(n % 3 == 0 && n < 1000) {
				
				soma += i; 
				System.out.println("Multiplos de 3: " + soma);
				
			} else if(n % 5 == 0 && n < 1000) { 
				
				soma += i; 
				System.out.println("Multiplos de 5: " + soma);
			}
		}
		
	}

}
