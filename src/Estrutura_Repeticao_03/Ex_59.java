package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor_habitantes, consumo_mes = 0, soma = 0, consumo_medio_habitante = 0, maior = 0, menor = 0, 
				quant = 0, soma_c = 1, habitantes ; 
		
		soma_c = quant = consumo_mes = maior = menor = 0;
		
		int codigo_consumidor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Código do consumidor: \n");
		System.out.println("1 - Residencial");
		System.out.println("2 - Comercial");
		System.out.println("3 - Industrial"); 
		
		System.out.println("Informe o código do consumidor: "); 
		codigo_consumidor = sc.nextInt(); 
		
		switch(codigo_consumidor) {
		
		case 1: 
			
			for(int i = 1; i < 3; i++) {
				
				System.out.printf("Informe o numero de habitantes da %d cidade: ", i);
				habitantes = sc.nextDouble(); 
				
				System.out.println("Informe o valor do kwd: ");
				valor_habitantes = sc.nextDouble();
				
				System.out.println("Informe o consumo do mês: ");
				consumo_mes = sc.nextDouble(); 
				
				soma = valor_habitantes + consumo_mes;
				consumo_medio_habitante = soma / 3;
				
				System.out.printf("Habitante %.2f \n", habitantes);
				System.out.printf("Total do consumo da Categoria Residencial: %.2f\n", soma);
				System.out.printf("Consumo médio dos habitantes: %.2f \n", consumo_medio_habitante);
				
				soma_c += consumo_mes;
				
				quant += 1; 
				
				if(quant == 1) {
					
					maior = menor = consumo_mes;
					
				} else {
					
					if(consumo_mes < menor) {
						
						menor = consumo_mes;
					}
					
					if(consumo_mes > maior) {
						
						maior = consumo_mes;
					}
				}
			}
			
			System.out.printf("Maior consumo : %.2f \n", maior);
			System.out.printf("Menor consumo: %.2f \n", menor);
			
			break;
			
		case 2: 
			
			for(int i = 1; i < 3; i++) {
				
				System.out.printf("Informe o numero de habitantes da %d cidade: ", i);
				habitantes = sc.nextDouble(); 
				
				System.out.println("Informe o valor do kwd: ");
				valor_habitantes = sc.nextDouble();
				
				System.out.println("Informe o consumo do mês: ");
				consumo_mes = sc.nextDouble(); 
				
				soma = valor_habitantes + consumo_mes;
				consumo_medio_habitante = soma / 3;
				
				System.out.printf("Habitante %.2f \n", habitantes);
				System.out.printf("Total do consumo da Categoria Residencial: %.2f\n", soma);
				System.out.printf("Consumo médio dos habitantes: %.2f \n", consumo_medio_habitante);
				
				soma_c += consumo_mes;
				
				quant += 1; 
				
				if(quant == 1) {
					
					maior = menor = consumo_mes;
					
				} else {
					
					if(consumo_mes < menor) {
						
						menor = consumo_mes;
					}
					
					if(consumo_mes > maior) {
						
						maior = consumo_mes;
					}
				}
			}
			
			System.out.printf("Maior consumo : %.2f \n", maior);
			System.out.printf("Menor consumo: %.2f \n", menor);
			
			break;
			
		case 3: 
			
			for(int i = 1; i < 3; i++) {
				
				System.out.printf("Informe o numero de habitantes da %d cidade: ", i);
				habitantes = sc.nextDouble(); 
				
				System.out.println("Informe o valor do kwd: ");
				valor_habitantes = sc.nextDouble();
				
				System.out.println("Informe o consumo do mês: ");
				consumo_mes = sc.nextDouble(); 
				
				soma = valor_habitantes + consumo_mes;
				consumo_medio_habitante = soma / 3;
				
				System.out.printf("Habitante %.2f \n", habitantes);
				System.out.printf("Total do consumo da Categoria Residencial: %.2f\n", soma);
				System.out.printf("Consumo médio dos habitantes: %.2f \n", consumo_medio_habitante);
				
				soma_c += consumo_mes;
				
				quant += 1; 
				
				if(quant == 1) {
					
					maior = menor = consumo_mes;
					
				} else {
					
					if(consumo_mes < menor) {
						
						menor = consumo_mes;
					}
					
					if(consumo_mes > maior) {
						
						maior = consumo_mes;
					}
				}
			}
			
			System.out.printf("Maior consumo : %.2f \n", maior);
			System.out.printf("Menor consumo: %.2f \n", menor);
			
			break;
		}
		
	}

}
