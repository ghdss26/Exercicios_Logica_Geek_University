package Funcoes_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vet[] = new int[3]; 
		
		impressao_normal(vet);
		media_aritmetica(vet);
		impressao_inversa(vet);
	}

	private static void impressao_normal(int[] vet) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i; 
		
		for(i = 0; i < vet.length; i++) {
			
			System.out.printf("Informe o %d número do Vetor: ", i);
			vet[i] = sc.nextInt(); 
		}
		
		for(i = 0; i < vet.length; i++) {
			
			System.out.printf("Impressão do vetor: [%d] = [%d] \n", i, vet[i]);
		}
	}
	
	private static void media_aritmetica(int[] vet) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		double soma = 0;
		double media_aritmetica = 0; 
		
		for(n = 0; n < vet.length; n++) {
			
			System.out.printf("Informe o %d número do vetor: ", n);
			vet[n] = sc.nextInt(); 
		}
		
		for(n = 0; n < vet.length; n++) {
			
			soma += vet[n]; 
			media_aritmetica = soma / 3;
		}
		
		System.out.printf("Média Aritmética: %.2f \n", media_aritmetica);
	}
	
	private static void impressao_inversa(int[] vet) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, j, temp = 0;
		
		for(n = 0; n < vet.length; n++) {
			
			System.out.printf("Informe o %d número do vetor: ", n);
			vet[n] = sc.nextInt(); 
		}
		
		for(n = 0; n < vet.length; n++) {
			
			for(j = 0; j < n; j++) {
				
				temp = vet[n]; 
				vet[n] = vet[j]; 
				vet[j] = temp;
			}
		}
		
		for(n = 0; n < vet.length; n++) {
			
			System.out.printf("Vetor [%d] = [%d] \n", n, vet[n]);
		}
		
	}
}
