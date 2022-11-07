package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String estado;
		double valor, preco_final; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe o valor do produto");
		valor = sc.nextDouble();
		
		System.out.println("Informe o nome do Estado");
		estado = sc.next();  
		
		if(estado.equalsIgnoreCase("MG")) {
			
			preco_final = valor + ((valor * 7) / 100); 
			
			System.out.printf("Preço final do imposto em Minas Gerais: %.2f", preco_final);
			
		} else if(estado.equalsIgnoreCase("SP")) {
			
			preco_final = valor + ((valor * 12) / 100); 
			
			System.out.printf("Preço final do imposto em São Paulo: %.2f", preco_final);
			
		} else if(estado.equalsIgnoreCase("RJ")) {
			
			preco_final = valor + ((valor * 15) / 100); 
			
			System.out.printf("Preço final do imposto no Rio de Janeiro: %.2f", preco_final); 
			
		} else if(estado.equalsIgnoreCase("MS")) {
			
			preco_final = valor + ((valor * 8) / 100); 
			System.out.printf("Preço final do imposto em Mato grosso do sul: %.2f", preco_final);
			
		} else {
			
			System.out.println("Estado inválido");
		}
	}

}
