/**
 * 
 * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. 
 * A fórmula de conversão é: F = C * (9 / 5) + 32.0, sendo F a temperatura em Fahrenheit 
 * e C a temperatura em Celsius. 
 */

package Indrotucao_01;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o graus Celsius: ");
		double C = sc.nextDouble(); 
		
		double F = (C * (9 / 5) + 32);
		
		System.out.println("Fahrenheit: " + F);
	}

}
