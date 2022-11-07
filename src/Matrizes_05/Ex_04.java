
package Matrizes_05;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int i, j, maior = 0, soma = 0, quant; 
		
		soma = quant = maior;
		
		int m[][] = new int[4][4]; 
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				System.out.printf("Informe a %d linha e %d coluna da Matriz: ", i, j); 
				m[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				System.out.printf("Leitura da Matriz: [%d] [%d] = [%d] \n", i, j, m[i][j]);
			}
		}
		
		for(i = 0; i < m.length; i++) {
			
			for(j = 0; j < m.length; j++) {
				
				soma += m[i][j]; 
				
				quant += 1; 
				
				if(quant == 1) {
					
					maior = m[i][j]; 
					
				} else {
					
					if(m[i][j] > maior) {
						
						maior = m[i][j];
					}
				}
			}
			
			System.out.printf("Maior Valor da Linha e Coluna é: %d %d = %d \n", i, j, maior);
		}
	}

}
