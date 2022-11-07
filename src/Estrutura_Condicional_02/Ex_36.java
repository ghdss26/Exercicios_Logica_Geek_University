package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor_venda, comissao = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor da venda: "); 
		valor_venda = sc.nextDouble(); 
		
		if(valor_venda >= 100001.00) {
			
			comissao = valor_venda + (700.00 * 0.16); 
			
		} else if(valor_venda <= 100000 && valor_venda >= 810000) {
			
			comissao = valor_venda + (650.00 * 0.14);
			
		} else if(valor_venda <= 80000 && valor_venda >= 610000) {
			
			comissao = valor_venda + (600.00 * 0.14); 
			
		} else if(valor_venda <= 600000 && valor_venda >= 410000) {
			
			comissao = valor_venda + (550.00 * 0.14); 
			
		} else if(valor_venda <= 400000 && valor_venda >= 210000) {
			
			comissao = valor_venda + (500.00 * 0.14); 
			
		} else if(valor_venda <= 200000) {
			
			comissao = valor_venda + (400.00 * 0.14);
		}
		
		System.out.printf("A comissão vai ser de: %.2f", comissao);
	}
}
