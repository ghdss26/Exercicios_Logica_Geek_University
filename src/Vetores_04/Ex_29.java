package Vetores_04;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, quant = 0;
		
		int numero[] = new int[6]; 
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			numero[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			if(numero[i] % 2 == 0) {
				
				System.out.printf("Número par %d = %d \n", i, numero[i]);
				soma += numero[i]; 
				
			} else {
				
				System.out.printf("Número impar %d = %d \n", i, numero[i]); 
				quant++;
				
			}
		}
		
		System.out.printf("A soma dos números pares é: %d \n", soma);
		System.out.printf("A quantidade dos números impares é: %d \n", quant);
	}

}
