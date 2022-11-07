package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 4;
		
		do {
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("1 - Conversão de Km para ms");
			System.out.println("2 - Conversão de ms para Km \n"); 
			
			System.out.println("Informe a opção que você deseja: ");
			opcao = sc2.nextInt();
			
			if(opcao >= 3) {
				
				break;
			}

			switch(opcao) {
			
			case 1:
				
				double km, ms = 3.6, conversao = 0; 
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Informe a velocidade expressa em Km/h: ");
				km = sc.nextDouble(); 
				
				conversao = km / ms;
				
				if(conversao <= 0) {
					
					System.out.println("inválido");
					
				} else {
					
					System.out.printf("Resultado da conversão: %.2f \n", conversao);
				}
				
				break;
				
			case 2: 
				
				double km1 = 3.6, ms1, conversao1 = 0; 
				
				Scanner sc1 = new Scanner(System.in);
				
				System.out.println("Informe a velocidade expressa em m/s: \n");
				ms1 = sc1.nextDouble(); 
				
				conversao1 = ms1 * km1;
				
				if(conversao1 <= 0) {
					
					System.out.println("inválido");
					
				} else {
					
					System.out.printf("Resultado da conversão: %.2f \n", conversao1);
				}
				
				break; 
			}
			
		} while(opcao != 1 || opcao !=2);
	}

}
