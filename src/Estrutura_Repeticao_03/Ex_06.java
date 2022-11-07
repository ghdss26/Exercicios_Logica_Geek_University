package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero; 
		int soma = 0;
		int media = 0; 
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero = sc.nextInt(); 
			
			soma += numero; 
			media = soma / 10;
		}
		
		System.out.println("A Soma dos valores é: " + soma);
		System.out.println("A Média dos valores é: " + media);
	}

}
