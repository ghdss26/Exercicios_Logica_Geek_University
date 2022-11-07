package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		for(int i = 1; i < n; i++) {
			
			if(n % i == 0) {
				
				soma += i;
			}
		}
		
		System.out.println("Soma: " + soma);
	}

}
