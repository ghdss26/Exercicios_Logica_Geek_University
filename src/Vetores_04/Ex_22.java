package Vetores_04;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetA[] = new int[10]; 
		int vetB[] = new int[10];
		int vetC[] = new int[10]; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < vetA.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i);
			vetA[i] = sc.nextInt(); 
		}
		
		for(int j = 0; j < vetB.length; j++) {
			
			System.out.printf("Informe o %d número do vetor: ", j); 
			vetB[j] = sc.nextInt(); 
		}
		
		for(int i = 0; i < vetA.length; i++) {
			
			if(vetA[i] % 2 == 0) {
				
				vetC[i] = vetA[i] + vetA[i];
				
				System.out.println("Somá dos vetores pares: " + vetC[i]); 
			}
		}
		
		for(int j = 0; j < vetB.length; j++) {
			
			if(vetB[j] % 2 != 0) {
				
				vetC[j] = vetB[j] + vetB[j]; 
			}
			
			System.out.println("Somá dos vetores impares: " + vetC[j]); 
		}
	}

}
