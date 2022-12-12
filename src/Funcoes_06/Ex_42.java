package Funcoes_06;

import java.util.Scanner;

public class Ex_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 0; 
		
		Valores(val);
	}

	private static void Valores(int val) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double vet[] = new double[3];
		
		double soma = 0, media = 0;
		
		for(val = 0; val < vet.length; val++) {
			
			System.out.printf("Informe o %d número do vetor: ", val);
			vet[val] = sc.nextDouble();
		}
		
		for(val = 0; val < vet.length; val++) {
			
			soma += vet[val];
			media = soma / 3;
		}
		
		System.out.printf("Média do Vetor é: [%d] = [%.2f]", val, media);
	}

}
