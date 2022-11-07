package Vetores_04;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[10]; 
		
		int vet1[] = new int[10]; 
		
		int vet2[] = new int[10];
		
		for(int i = 0; i < vet.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			vet[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < vet.length; i++) {
			
			vet1[i] = vet[i]; 
			
			if(vet1[i] % 2 != 0) {
				
				System.out.printf("Elemento Impar Utilizado: %d = %d \n", i, vet1[i]); 
				
			} 
		}
		
		for(int i = 0; i < vet.length; i++) {
			
			vet2[i] = vet[i]; 
			
			if(vet2[i] % 2 == 0) {
				
				System.out.printf("Elemento Par Utilizado: %d = %d \n", i, vet2[i]); 
			}
		}
	}

}
