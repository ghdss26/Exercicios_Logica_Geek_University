package Indrotucao_01;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero, soma = 1; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			numero = sc.nextDouble(); 
			
			soma = numero + Math.pow(numero, 2);
		}
		
		System.out.printf("Total do Somátorio vai ser de: %.2f", soma);
	}

}
