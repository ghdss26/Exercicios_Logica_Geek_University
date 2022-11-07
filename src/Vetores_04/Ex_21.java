package Vetores_04;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetA[] = new int[10]; 
		int vetB[] = new int[10]; 
		
		int vetC[] = new int[10]; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < vetA.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i); 
			vetA[i] = sc.nextInt(); 
		}
		
		for(int j = 0; j < vetB.length; j++) {
			
			System.out.printf("Informe o %d número do vetor: ", j); 
			vetB[j] = sc.nextInt(); 
		}
		
		for(int i = 0; i < vetA.length; i++) {
			
			for(int j = 0; j < vetB.length; j++) {
				
				vetC[i] = vetA[i] - vetB[j];
			}
			
			System.out.println("Resultado vai ser: " + vetC[i]);
		}
		
		
	}

}
