/*
 * 
 * Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre: 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		double numero;
		double quadrado = 0;
		double raiz_quadrada = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		numero = sc.nextDouble();
		
		if(numero > 0) {
			
			 quadrado = Math.pow(numero, 2); 
			 raiz_quadrada = Math.sqrt(numero);
			 
			System.out.println("Elevado ao quadrado: " + quadrado);
			System.out.println("Raíz Quadrada: " + raiz_quadrada);
			
		} else {
			
			System.out.println("Número ínvalido");
		}
	}
}
