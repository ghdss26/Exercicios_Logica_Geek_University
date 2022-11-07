package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 999; // contador 
		int j; // contador
		int n; // número calculado 
		int t; // número temporario 
		int ni; // número invertido
		int im = 1; // i do MNC 
		int jm = 1; // j do MNC 
		
		int mnc = 0; // j do MNC
		
		for(n = i * i; n > mnc; n = i * i) {
			
			for(j = i; n > mnc; n = i * j) {
				
				ni = 0; 
				
				for(t = n; t > 0; t /= 10) {
					
					ni = ni * 10 + t % 10;
				}
				
				if (n == ni) {
					
					mnc = n; 
					im = i; 
					jm = j; 
				}
				
				j--; 
			}
			
			i--;
		}
		
		System.out.printf("Maior número do palindrome: %d = %d x %d \n", mnc, im, jm);
	}

}
