package Matrizes_05;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String escolha[][] = new String[5][10]; 
		
		char gabarito[] = new char[10];
		
		int resultado[] = new int[10];
		
		Scanner sc = new Scanner(System.in); 
		
		int i, j;
		
		for(i = 0; i < escolha.length; i++) {
			
			for(j = 0; j < escolha.length; j++) {
				
				System.out.printf("Informe a %d linha letra de multipla escolha na %d coluna: ", i, j);
				escolha[i][j] = sc.next();
			}
		}
		
		for(i = 0; i < gabarito.length; i++) {
			
			System.out.printf("Informe %d gabarito: ", i); 
			gabarito[i] = sc.next().charAt(0);
		}
		
		for(i = 0; i < escolha.length; i ++) {
			
			for(j = 0; j < escolha.length; j++) {
				
				System.out.printf("Resposta do Aluno: [%d][%d] = %s \n", i, j, escolha[i][j]);
			}	
		}
		
		System.out.println("");
		System.out.println("Leitura do Gabarito: ");
		
		for(i = 0; i < gabarito.length; i++) {
			
			System.out.println("Gabarito da Resposta: " + gabarito[i]);
		}
		
		for(i = 0; i < escolha.length; i++) {
			
			for(j = 0; j < escolha.length; j++) {
				
				if(escolha[i][j].charAt(0) == gabarito[i]) {
					
					resultado[i] = gabarito[i];
					
				}
			}
		}
		
		System.out.println("Acertos: " + i++);
	
	}

}
