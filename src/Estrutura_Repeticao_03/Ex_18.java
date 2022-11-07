package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, maior = 0, contador = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Informe o %d número:", i); 
			n = sc.nextInt();
			
			if(n > maior) {
				
				maior = n;
				contador++;
			}
			
		}
		
		System.out.println("Maior Número: " + maior); 
		System.out.println("Quantidades: " + contador);
	}
}
