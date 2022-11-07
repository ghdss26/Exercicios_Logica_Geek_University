/**
 * 
 * Leia uma velocidade em Km/h e apresente-a convertida em m/s. A fórmula de conversão é M: K / 3.6
 * sendo K a velocidade em KM/H e M em M/s
 * 
 */

package Indrotucao_01;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a velocidade em km/h: ");
		double K = sc.nextDouble(); 
		
		double M = K / 3.6;
		
		System.out.printf("Metros por Segundo: %.2f", M);
	}

}
