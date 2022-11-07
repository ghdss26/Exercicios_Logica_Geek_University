package Vetores_04;

import java.util.Scanner;

public class Ex_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero[] = new double[10]; 
		
		double aux; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			numero[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			for(int j = i + 1; j < numero.length; j++) {
				
				if(numero[i] > numero[j]) {
					
					aux = numero[i]; 
					numero[i] = numero[j];
					numero[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf(" Valor Ordenado: %d = %.2f \n ", i, numero[i]);
		}
		
	}

}
