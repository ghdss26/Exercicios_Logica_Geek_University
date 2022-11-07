/*
 * 
 * Escreva um programa que declare um inteiro, inicialize-o com 0, incremente-o de 1000 em 1000, 
 * imprimindo seu valor na tela, até que seu valor seja 100000.
 */

package Estrutura_Repeticao_03;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0; 
		
		while (i < 100000) {
			
			i = i + 1000;
			
			System.out.println(i);
		}
	}

}
