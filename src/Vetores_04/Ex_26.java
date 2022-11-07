package Vetores_04;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double vet[] = new double[10];
		
		int n = 10; 
		
		double media, desvio = 0, soma = 0; 
		
		for(int i = 0; i < vet.length; i++) {
			
			System.out.printf("Informe o %d vetor da posição: ", i);
			vet[i] = sc.nextDouble();
			
			soma += vet[i];
			
			media = soma / n - 1; 
			
			desvio = Math.sqrt(Math.pow(vet[i] - media, 2));
			
		}
		
		System.out.printf("Desvio Padrão: %.2f", desvio);
	}

}
