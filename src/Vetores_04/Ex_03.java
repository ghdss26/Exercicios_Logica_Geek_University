
/*
 * Ler um conjunto de números reais, armazenando - o em vetor e calcular o quadrado das componentes deste vetor
 * armazenando o resultado em outro vetor. Os conjuntos têm 10 elementos cada, Imprimir todos os conjuntos
 *  
 */

package Vetores_04;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double[] numero = new double[11];
		double[] quadrado = new double[11];
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do conjunto: ", i); 
			numero[i] = sc.nextInt(); 
			
			quadrado[i] = (int) Math.pow(numero[i], 2);
			
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.println(quadrado[i]);
		}
		
		
	}

}
