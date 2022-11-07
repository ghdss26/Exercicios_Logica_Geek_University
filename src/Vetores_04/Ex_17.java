package Vetores_04;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] numero = new double[10]; 
		
		int i; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			numero[i] = sc.nextDouble(); 
		}
		
		for(i = 0; i < numero.length; i++) {
			
			if(numero[i] < 0) {
				
				System.out.printf("Valor Negativo: %d = %.2f \n", i, numero[i]);
			}
		}
	}

}
