package Funcoes_06;

import java.util.Scanner;

public class Ex_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4;
		
		parameto(x);
	}

	private static void parameto(int x ) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[x]; 
		int b[] = new int[x];
		
		for(x = 0; x < a.length; x++) {
			
			System.out.printf("Informe o %d número do vetor de A: ", x);
			a[x] = sc.nextInt(); 
		}
		
		for(x = 0; x < b.length; x++) {
			
			System.out.printf("Informe o %d número do vetor de B: ", x);
			b[x] = sc.nextInt();
		} 
		
		for(x = 0; x < a.length; x++) {
			
			if(a[x] % 2 == 0) {
				
				System.out.printf("Número Par do vetores de A: [%d] = [%d] \n", x, a[x]);
				
			}
		}
		
		for(x = 0; x < b.length; x++) {
			
			if(b[x] % 2 != 0) {
				
				System.out.printf("Número Par do vetores de B: [%d] = [%d] \n", x, b[x]);
				
			}
		}
		
	
	}

}
