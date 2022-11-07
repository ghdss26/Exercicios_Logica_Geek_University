package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo; 
		int quantidade; 
		double preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do produto: "); 
		codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade de pedidos: "); 
		quantidade = sc.nextInt(); 
		
		switch(codigo) {
		
		case 100:
			
			preco = 1.20 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
			
		case 101: 
			
			preco = 1.30 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
			
		case 102: 
			
			preco = 1.50 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
			
		case 103: 
			
			preco = 1.20 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
			
		case 104: 
			
			preco = 1.70 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
			
		case 105: 
			
			preco = 2.20 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
			
		case 106: 
			
			preco = 1.00 * quantidade; 
			
			System.out.printf("Valor Total: %.2f", preco);
			break;
		}
	}

}
