/**
 * 
 * Leia uma temperatura em graus Fahrenheit e apresente - a convertida em graus Celsius.
 * A formula de conversão é C = 5.0 * (F - 32.0) / 9.0, sendo C a temperatura em Celsius 
 * e F em Fahrenheit.
 * 
 */

package Indrotucao_01;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número para o Fahrenheit: "); 
		double F = sc.nextDouble(); 
		
		double C = (5 * (F - 32) / 9); 
		
		System.out.printf("Celsius: %.2f", C);
	}

}
