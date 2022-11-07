package Vetores_04;

import java.util.Scanner;

public class Ex_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 11, aux = 0;
		
		int n[] = new int[numero];
		
		for(int i = 0; i < n.length; i++) {
			
			System.out.printf("Informe %d número: ", i);
			n[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			
			for(int j = i + 1; j < n.length; j++) {
				
				if(n[i] > n[j]) {
					
					aux = n[i]; 
					n[i] = n[j]; 
					n[j] = aux; 
				}
			}
		}
		
		for(int i = 0; i < n.length; i++) {
			
			System.out.printf("Número %d = %d \n", i, n[i]);
		}
	}
}
