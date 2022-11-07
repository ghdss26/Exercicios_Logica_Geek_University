package Vetores_04;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] numero = new double[10]; 
		
		Scanner sc = new Scanner(System.in); 
		
		int quant = 0;
		
		double soma = 0;
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			if(numero[i] < 0) {
				
				quant++;
				
			}
			
			if(numero[i] > 0) {
				
				soma += numero[i];
			}
		}
		
		System.out.println("Quantidade de números negativos: " + quant);
		System.out.println("Somátorio dos numeros: " + soma);
	}

}
