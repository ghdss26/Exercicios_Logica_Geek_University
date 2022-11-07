/**
 * 
 * Leia um número real. Se o número for positivo imprima a raiz quadrada. Do Contrário, 
 * imprima o número ao quadrado.
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número: "); 
		numero = sc.nextDouble(); 
		
		if(numero > 0) {
			
			double raiz_quadrada = Math.sqrt(numero); 
			
			System.out.printf("Raiz Quadrada: %.2f", raiz_quadrada);
			
		} else {
			
			double quadrado = Math.pow(numero, 2);
			
			System.out.printf("Elevado ao Quadrado: %.2f", quadrado);
		}
	} 

}
