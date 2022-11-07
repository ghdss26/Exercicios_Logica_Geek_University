package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double preco_antigo, preco_novo = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o preco_antigo: "); 
		preco_antigo = sc.nextDouble(); 
		
		if(preco_antigo < 50) {
			
			preco_novo = preco_antigo + (preco_antigo * 0.05); 
			
		} else if(preco_antigo >= 50  && preco_antigo < 100) {
			
			preco_novo = preco_antigo + (preco_antigo * 0.1);
			
		} else if(preco_antigo > 100) {
			
			preco_novo = preco_antigo + (preco_antigo * 0.15);
		}
		
		System.out.printf("Preço novo: %.2f \n", preco_novo);
		
		if(preco_novo < 80) {
			
			System.out.println("Barato"); 
			
		} else if(preco_novo > 120) {
			
			System.out.println("Normal"); 
			
		} else if(preco_novo <= 200) {
			
			System.out.println("Caro");
			
		} else if(preco_novo > 201) {
			
			System.out.println("Situação: Muito Caro");
		}
	}
}
