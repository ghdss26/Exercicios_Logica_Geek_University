/*
 * Leia uma temperatura em graus Kelvin e apresente - a convertida em graus Celsius. 
 * A fórmula de conversão é: C = K - 273.15, sendo C a temperatura em Celsius e K a 
 * temperatura Kelvin
 * 
 */

package Indrotucao_01;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Kelvin: ");
		double K = sc.nextDouble(); 
		
		double C = K - 273.15; 
		
		System.out.printf("Celsius: %.2f", C);
	}

}
