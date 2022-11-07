
package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, divisor = 0, multiplo = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt(); 
		
		for(int i = numero; divisor < 1; i++) {
			
			if(i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
				
				multiplo = i;
				divisor++;
			}
		}
		
		System.out.printf("Multiplo: %d", multiplo);
	}

}
