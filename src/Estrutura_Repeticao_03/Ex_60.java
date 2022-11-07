package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao; 
		
		double numero = 0, soma = 0, maior = 0, menor = 0, quant = 0, media = 0; 
		int contador = 0;
		
		soma = quant = numero = maior = menor = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("1 - Soma dos números digitados \n");
		System.out.println("2 - A quantidade de números digitados \n"); 
		System.out.println("3 - A Média dos números digitados \n"); 
		System.out.println("4 - O Maior número digitado \n"); 
		System.out.println("5 - O Menor número digitado \n"); 
		System.out.println("6 - A média dos números pares \n"); 
		
		System.out.println("0 - A média dos números pares \n");
		
		System.out.println("Informe uma opção: ");
		opcao = sc.nextInt(); 
		
		switch(opcao) {
		
		case 1:
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble(); 
				
				soma += numero;
			}
			
			System.out.printf("A soma dos números é : %.2f", soma);
			
			break;
			
		case 2: 
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble(); 
				
				contador++;
			}
			
			System.out.println("Quantidade de Digitdos: " + contador);
			
			break;
			
		case 3: 
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble(); 
				
				soma += numero;
				media = soma / 10;
			}
		
			System.out.printf("A média dos números é : %.2f", media);
			
			break;
			
		case 4: 
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble(); 
				
				if(numero > maior) {
					
					maior = numero;
				}
			}
			
			System.out.printf("O Maior número é: %.2f", maior);
			
			break;
			
		case 5:
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble();
				
				soma += numero;
				quant += 1;
				
				if(quant == 1) {
					
					maior = menor = numero; 
					
				} else {
					
					if(numero > maior) {
						
						maior = numero;
					}
					
					if(numero < menor) {
						
						menor = numero;
					}
				}
			}
			
			System.out.printf("Maior número é: %.2f", maior);
			System.out.printf("Menor número é: %.2f", menor);
			
			break;
			
		case 6:
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				numero = sc.nextDouble(); 
				
				soma += numero;
				
				if(soma % 2 == 0) {
					
					media = soma / 10;
				}
			}
		
			System.out.printf("A média dos números é : %.2f", media);
			break;
			
		case 0: 
			
			System.out.println("saindo");
			break;
		}
	}

}
