package Vetores_04;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = new int[10]; 
		int[] numero2 = new int[10]; 
		
		Scanner sc = new Scanner(System.in);  
		
		for(int i = 1; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			numero[i] = sc.nextInt(); 
		}
		
		System.out.println("Vetor Número 1");
		System.out.println(" ");
		
		for(int i = 1; i < numero.length; i++) {
			
			System.out.printf("Preenchimento do Vetor Número : %d = %d \n", i, numero[i]);
			
		}
		
		System.out.println("Vetor Número 2: Impares");
		System.out.println(" ");
		
		for(int i = 0; i < numero2.length; i++) {
			
			if(numero[i] % 2 != numero2[i]) {
				
				System.out.printf("Preenchimento do Vetor Número 2: %d = %d \n", i, numero[i]);
			}
		}	
	}

}
