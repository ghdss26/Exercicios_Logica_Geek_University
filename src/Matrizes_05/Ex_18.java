package Matrizes_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int[3][3]; 
		
		int vet[] = new int[3]; 
		
		int i, j; 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da matriz: ", i, j); 
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < vet.length; i++) {
			
			System.out.printf("Informe a %d linha do vetor: ", i); 
			vet[i] = sc.nextInt(); 
		}
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				vet[i] = vet[i] + mat[i][j]; 
			}
		}
		
		for(i = 0; i < vet.length; i++) {
			
			System.out.printf("Somatório é: %d \n", vet[i]);
		}
	}

}
