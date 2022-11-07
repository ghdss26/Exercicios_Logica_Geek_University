package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int n = 2000000; 
		
		int primo, soma = 0; 
		
		double raizQuad;
		
		for(int i = 3; i < n; i += 2) {
			
			primo = 1; 
			raizQuad = Math.sqrt(i);
			
			for(int j = 3; j <= raizQuad; j += 2) {
				
				if(i % j == 0) {
					
					primo = 0;
					break;
				}
			}
			
			if(primo == 1) {
				
				soma += i;
			}
		}
		
		System.out.printf("a soma dos numeros primos abaixo de 2 milhoes eh: %d", soma);
	}

}
