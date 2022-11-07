package Vetores_04;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = new int[3]; 
		
		Scanner sc = new Scanner(System.in); 
		
		int i = 0; 
		
		for(i = 0; i < n.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			n[i] = sc.nextInt();
		}
		
		for(i = 0; i < n.length; i++) {
			
			if(n[i] < 0) {
				
				n[i] = 0; 
			}
			
			System.out.printf("Posição do Vetor %d = %d \n", i, n[i]);
		}
		
	}

}
