package Vetores_04;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double[] numero = new double[10];
		
		double maior = 0, posicao = 0; 
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero[i] = sc.nextDouble(); 
			
			if(numero[i] > maior) {
				
				maior = numero[i];
				posicao++;
			}
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Posição dos elementos: [%d] = [%.2f] \n", i, numero[i]);
		}
		
		System.out.printf("Maior número: %.2f \n", maior); 
		System.out.printf("Posição do maior número: %.2f \n", posicao);
	}

}
