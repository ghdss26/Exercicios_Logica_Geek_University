package Vetores_04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = {7, 2, 5, 8, 4}; 
		int vet2[] = {4, 2, 9, 5, 7};
		
		int vet3[] = intersecao(vet1, vet2);  
		
		System.out.println(Arrays.toString(vet3));
	}

	private static int[] intersecao(int[] vet1, int[] vet2) {
		// TODO Auto-generated method stub
		
		int ass[] = new int[vet1.length + vet2.length]; 
		
		int cont = 0; 
		
		for(int i = 0; i < vet1.length; i++) {
			
			for(int j = 0; j < vet2.length; j++) {
				
				if(vet1[i] == vet2[j]) {
					
					ass[cont++] = vet1[i]; 
				}
			}
		}
		
		int vet3[] = new int[cont];
		
		for(int i = 0; i < cont; i++) {
			
			vet3[i] = ass[i]; 
		}
		
		return vet3;
	}

}
