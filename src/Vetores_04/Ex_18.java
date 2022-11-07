package Vetores_04;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, i, quant = 0;
		
		int[] numero = new int[10]; 
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			numero[i] = sc.nextInt(); 
		}
		
		System.out.println("Informe o valor de X: ");
		x = sc.nextInt(); 
		
		for(i = 0; i < numero.length; i++) {
			
			if(numero[i] % x == 0) {
				
				System.out.printf("Valor [%d] = [%d] \n", i, numero[i]);
				quant++;
			}
		}
		
		System.out.printf("Quantidade de Valores: %d \n", quant );
	}

}
