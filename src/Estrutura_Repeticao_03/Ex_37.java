package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (n / 100) + (n % 100) * (n / 100) + (n % 100)
		
		double n, baixa_ordem = 0, alta_ordem = 0, soma, quadrado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		n = sc.nextDouble();
		
		for(int i = 0; i < 9999; i++) {
			
			alta_ordem = (i / 100); 
			baixa_ordem = (i % 100);
			soma = baixa_ordem + alta_ordem;
			quadrado = soma * soma;
			
			if(quadrado == i) {
				
				System.out.printf("Alta Ordem: %.1f \n", baixa_ordem);
				System.out.printf("Baixa Ordem: %.1f \n", alta_ordem);
				System.out.printf("Soma: %.1f \n", soma);
				System.out.printf("Quadrado: %.1f \n", quadrado);
			}
		}
	}
}
