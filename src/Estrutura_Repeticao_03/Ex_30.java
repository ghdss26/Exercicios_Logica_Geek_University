package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, sinal; 
		double soma; 
		int auxiliar = 1; 
		soma = 0; 
		sinal = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(auxiliar > 0) {
			
			System.out.println("Digite um número qualquer "); 
			auxiliar = sc.nextInt(); 
			
			if(auxiliar > 0) {
				
				for(i = 1; i <= (2 * auxiliar - 1); i++) {
					
					soma += sinal * i; 
					sinal -= sinal; 
				}
				
				System.out.printf("O Resultado da série é %.2f \n", soma); 
				
			} else {
				
				System.out.println("Entrada terminada pelo usuário \n");
			}
		}
	}

}
