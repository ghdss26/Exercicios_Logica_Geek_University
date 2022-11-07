package Vetores_04;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero[] = new double[20]; 
		
		double aux = 0; 
		
		boolean repetir; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			numero[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			repetir = false; 
			
			for(int j = 0; j < i; j++) {
				
				if(numero[i] == numero[j]) {
					
					repetir = true; 
				}
			}
			
			if(!repetir) {
				
				System.out.printf("[%d] = [%.2f] \n", i, numero[i]);
			}
		}
	}

}
