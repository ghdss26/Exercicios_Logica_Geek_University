package Vetores_04;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double vetorA[] = new double[5]; 
		double vetorB[] = new double[5]; 
		
		int k;
		
		double produto = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(k = 0; k < vetorA.length; k++) {
			
			System.out.printf("Informe o %d número do Vetor A: ", k); 
			vetorA[k] = sc.nextDouble(); 
		}
		
		for(k = 0; k < vetorB.length; k++) {
			
			System.out.printf("Informe o %d número do Vetor B: ", k);
			vetorB[k] = sc.nextDouble(); 
		}
		
		for(k = 0; k < vetorA.length; k++) {
			
			produto = produto + vetorA[k] * vetorB[k];
		}
		
		System.out.printf("O Conjunto dos Produtos é: %.2f", produto);
	}

}
