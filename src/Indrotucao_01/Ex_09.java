/*
 * Leia uma temperatura em Celsius e apresente-a em Kelvin. A Formula de conversão vai ser de: 
 * K = C + 273,15, sendo C a temperatura em Celsius e K a temperatura em Kelvin. 
 * 
 */

package Indrotucao_01;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double C = sc.nextDouble(); 
		
		double K = C + 273.15;
		
		System.out.printf("Kelvin: %.2f", K);
	}

}
