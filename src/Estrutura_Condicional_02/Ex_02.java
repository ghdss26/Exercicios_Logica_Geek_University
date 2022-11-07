/*
 * Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz quadrada do número. 
 * Se o número for negativo, mostre uma mensagem dizendo que o número é inválido 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		numero = sc.nextDouble(); 
		
		if (numero > 0) {
			
			double raiz_quadrada = Math.sqrt(numero);
			
			System.out.println(raiz_quadrada); 
			
		} else {
			
			System.out.println("Número inválido");
		}
	}

}
