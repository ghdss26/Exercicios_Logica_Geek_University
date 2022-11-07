
package Indrotucao_01;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double reais, resultado, dolares; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor em reais: R$");
		reais = sc.nextDouble();
		
		System.out.println("Digite um número para dolares: $");
		dolares = sc.nextDouble(); 
		
		resultado = reais * dolares; 
		
		System.out.printf("A cotação do dolar: %.2f", resultado);
				
	}

}
