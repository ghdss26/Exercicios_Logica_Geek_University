package Funcoes_06;

import java.util.Scanner;

public class Ex_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 0; 
		
		valores(val);
	}

	private static void valores(int val) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[3]; 
		
		int maior = 0;
		
		for(val = 0; val < vet.length; val++) {
			
			System.out.printf("Informe o %d número do vetor: ", val); 
			vet[val] = sc.nextInt(); 
		}
		
		for(val = 0; val < vet.length; val++) {
			
			if(vet[val] > maior) {
				
				maior = vet[val];
			}
		}
		
		System.out.printf("Maior número do vetor é: [%d] ",  maior);
	}

}
