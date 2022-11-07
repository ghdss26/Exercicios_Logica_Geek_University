package Indrotucao_01;

import java.util.Scanner;

public class Ex_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor_produto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: "); 
		valor_produto = sc.nextDouble(); 
		
		double resultado = valor_produto * 0.12; 
		double desconto = valor_produto - resultado;
		
		System.out.printf("Valor do desconto é: %.2f", desconto);
	}

}
