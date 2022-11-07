package Vetores_04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vet1[] = {9,2,5,6,5}; 
		int vet2[] = {6,12,2,9,12}; 
		int vet3[] = uniao(vet1, vet2); 
		
		System.out.println(Arrays.toString(vet3));
	}

	private static int[] uniao(int[] vet1, int[] vet2) {
		// TODO Auto-generated method stub
		
		int vet3[] = new int[vet1.length + vet2.length];
		int cont = 0;
		
		for(int i = 0; i < vet1.length; i++) {
			
			vet3[cont++] = vet1[i];
			
		}
		
		for(int i = 0; i < vet2.length; i++) {
			
			if(!existe(vet2[i], vet3, cont)) {
				
				vet3[cont++] = vet2[i];
			}
			
		}
		
		vet3 = Arrays.copyOf(vet3, cont);
		
		return vet3;
	}

	private static boolean existe(int x, int[] vet3, int cont) {
		// TODO Auto-generated method stub
		
			for(int i1 = 0; i1 < cont; i1++) {
				
				if(vet3[i1] == x) {
					
					return true;
				}
			}
			
		return false;
	}

}
