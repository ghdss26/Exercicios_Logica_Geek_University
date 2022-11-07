package Vetores_04;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] numero = new double[5]; 
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0, media = 0, maior = 0, menor = 0, n; 
		
		double quant = 0;
		
		soma = quant = maior = menor;
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d valor do vetor: ", i);
			numero[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("[%d] = [%.2f] \n", i, numero[i]); 
			
			soma += numero[i]; 
			media = soma / 5;
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			n = numero[i]; 
			
			soma += n; 
			quant += 1;
			
			if(quant == 1) {
				
				maior = menor = n; 
				
			} else {
				
				if(n > maior) {
					
					maior = n; 
				}
				
				if(n < menor) {
					
					menor = n;
				}
			}
		}
		
		System.out.printf("Maior número: %.2f \n", maior);
		System.out.printf("Menor número: %.2f \n", menor);
		
		System.out.printf("Soma dos números: %.2f \n", soma); 
		System.out.printf("Média dos números: %.2f \n", media); 
	}

}
