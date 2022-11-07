// Leia um número real e imprima a quinta parte deste número; 

package Indrotucao_01;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		float numero = 0, quinta = 0;  
		
		for(int i = 0; i < 1; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			numero = sc.nextFloat(); 
			
			quinta = numero / 5; 
		}
		
		System.out.println("A Quinta parte: " + quinta);
	}

}
