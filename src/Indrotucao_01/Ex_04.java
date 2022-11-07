// Leia um número real e imprima o resultado do quadrado desse número 

package Indrotucao_01;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		float numero, quadrado = 0; 
		
		for(int i = 0; i < 1; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			numero = sc.nextFloat(); 
			
			quadrado = (float) Math.pow(numero, 2);
			
		}
		
		System.out.println(quadrado);
	}

}
