package Funcoes_06;

import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
		
		int val = 0;
		
		Valores_inteiros(val);
	}

	private static void Valores_inteiros(int val) {
		
		Scanner sc = new Scanner(System.in); 
		
		double vet[] = new double[3]; 
		
		int cont = 0;
		
		for(val = 0; val < vet.length; val++) {
			
			System.out.printf("Informe o %d número do vetor: ", val); 
			vet[val] = sc.nextDouble();
		}
		
		for(val = 0; val < vet.length; val++) {
			
			if(vet[val] % 2 == 0) {
				
				System.out.printf("O [%d] número par é: [%.2f] \n", val, vet[val]);
				cont++; 
			}
		}
		
		System.out.println("Quantidade de Números Pares: " + cont);
	}

}
