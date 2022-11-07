package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Soma de 2 números");
		System.out.println("2 - Diferença entre 2 números (maior pelo menor)"); 
		System.out.println("3 - Produto entre 2 números "); 
		System.out.println("4 - Divisão entre 2 números"); 
		
		int opcao = 0;
		
		System.out.println("Informe uma opção: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 1: 
			
			double n = 0; 
			
			for(int i = 0; i < 2; i++) {
				
				System.out.printf("Informe o %d número: ", i);
				n = sc.nextInt(); 
			}
			
			for(int i = 0; i < 1; i++) {
				
				double soma;
				
				soma = n + n; 
				
				System.out.printf("Soma: %.2f", soma);
			}
			
			break;
			
		case 2: 
			
			int n1, n2; 
			int diferenca;
			
			System.out.println("Informe um número: "); 
			n1 = sc.nextInt(); 
			
			System.out.println("Informe um outro número: ");
			n2 = sc.nextInt(); 
			
			if(n1 > n2) {
				
				System.out.println("o " + n1 + " Maior que: " + n2);
				
				diferenca = n1 - n2;
				
				System.out.println("A diferença: " + diferenca);
				
			} else {
				
				System.out.println("o " + n2 + " Maior que: " + n1);
				
				diferenca = n2 - n1;
				
				System.out.println("A diferença: " + diferenca);
			}

			break;
			
		case 3: 
			
			double n3, n4; 

			System.out.println("Informe o primeiro número: "); 
			n3 = sc.nextDouble(); 
			
			System.out.println("Informe o segundo número: "); 
			n4 = sc.nextDouble(); 
			
			double produto = n3 * n4; 
			
			System.out.printf("Produto: %.2f", produto);
			
			break; 
			
		case 4:
			
			int n5, n6, denominador = 0; 
			
			System.out.println("Informe um número: "); 
			n5 = sc.nextInt(); 
			
			System.out.println("Informe um número: "); 
			n6 = sc.nextInt();
			
			denominador = n5 / n6;
			
			if(denominador == 0) {
				
				System.out.println("Não existe");
				
			} else {
				
				System.out.println("Denominador: " + denominador);
			}
		
			break;
		}	
	}
}
