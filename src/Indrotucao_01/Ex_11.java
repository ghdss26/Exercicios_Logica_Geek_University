/* 
 * Leia uma velocidade em m/s e apresente-a convertida em km/h. A formula de conversão é: K = M * 3,6, sendo 
 * K a velocidade em km/h e M em M/s. 
 * 
 */

package Indrotucao_01;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double M; 
		
		System.out.println("Informe uma velocidade: "); 
		M = sc.nextInt();
		
		double K = (int) (M * 3.6);
		
		System.out.printf("Velocidade em Metros por segundo na Escala : %.2f Km/v", K);
	}

}
