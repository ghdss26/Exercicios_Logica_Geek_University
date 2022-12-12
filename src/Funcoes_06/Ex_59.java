package Funcoes_06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_59 {

	public static void main(String[] args) {
		
		int vetor1[] = new int[10]; 
		int vetor2[] = new int[10]; 
		
		procedimento(vetor1, vetor2);
		int vetor3[] = uniao(vetor1, vetor2);
	
		System.out.println(Arrays.toString(vetor3));

	}

	private static void procedimento(int[] vetor1, int[] vetor2) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int i, j; 
		
		for(i = 0; i < vetor1.length; i++) {
			
			System.out.printf("Informe a %d linha do vetor1: ", i);
			vetor1[i] = sc.nextInt();
		}
		
		for(i = 0; i < vetor2.length; i++) {
			
			System.out.printf("Informe a %d linha do vetor2: ", i);
			vetor2[i] = sc.nextInt();
		}
	}

	private static int[] uniao(int[] vetor1, int[] vetor2) {
		
		int [] vetor3 = new int[vetor1.length + vetor2.length];
		
		int i;
		
		int c = 0; 
		
		for(i = 0; i < vetor1.length; i++) {
			
			vetor3[c++] = vetor1[i]; 
		}
		
		for(i = 0; i < vetor2.length; i++) {
			
			if(!existe(vetor2[i], vetor3, c)) {
				
				vetor3[c++] = vetor2[i];   
			}
		}
		
		vetor3 = Arrays.copyOf(vetor3, c);
		
		return vetor3 ;
	}

	private static boolean existe(int x, int[] vetor3, int c) {
		
		int i; 
		
		for(i = 0; i < c; i++) {
			
			if(vetor3[i] == x) {
				
				return true;
			}
		}
		
		return false;
	}

}
