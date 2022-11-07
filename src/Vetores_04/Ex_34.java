



package Vetores_04;

import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero[] = new int[10]; 
		
		int i, j;
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i);
			numero[i] = sc.nextInt(); 
			
			for(j = 0; j < i; j++) {
				
				if(numero[i] == numero[j]) {
					
					System.out.println("Mude de número. Já foi digitalizado"); 
					
					i--; 
					
					continue;
				}
			}
		}
		
		for(i = 0; i < numero.length; i++) {
			
			System.out.printf("Número Lido %d = %d \n", i, numero[i]);
		}
	}

}
