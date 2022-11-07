package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 1;
		
		do {
			
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão"); 
			System.out.println("5 - Saída");
			
			Scanner sc = new Scanner(System.in); 
			
			double n, soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;
			
			System.out.println("Informe uma opção: ");
			opcao = sc.nextInt(); 
			
			switch (opcao) {
			
			case 1: 
				
				for(int i = 0; i < 2; i++) {
					
					System.out.printf("Informe o %d número: ", i); 
					n = sc.nextDouble(); 
					
					soma += n;
			
				}
				
				System.out.printf("Resultado: %.2f \n", soma);
				
			
				break;
				
			case 2:
				
				for(int i = 0; i < 2; i++) {
					
					System.out.printf("Informe o %d número: ", i); 
					n = sc.nextDouble(); 
					
					subtracao -= n;
				
				}
				
				System.out.printf("Resultado: %.2f \n", subtracao);
				
				
				break;
				
			case 3: 
				
				for(int i = 0; i < 2; i++) {
					
					System.out.printf("Informe o %d número: ", i); 
					n = sc.nextDouble(); 
					
					multiplicacao = n * n;
				
				}
				
				System.out.printf("Resultado: %.2f \n", multiplicacao);
				
				
				break;
				
			case 4: 
				
				for(int i = 0; i < 2; i++) {
					
					System.out.printf("Informe o %d número: ", i); 
					n = sc.nextDouble(); 
					
					divisao = (n + n) / 2;
					
				}
				
				System.out.printf("Resultado: %.2f \n", divisao);
				
				break;
				
			case 5: 
				
				System.out.println("Saindo \n");
				
				break;
			}	
			
		} while(opcao != 5);
	}

}
