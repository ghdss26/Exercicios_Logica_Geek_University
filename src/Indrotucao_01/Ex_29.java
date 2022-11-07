package Indrotucao_01;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notas, media = 0, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			
			System.out.printf("Informe a %d nota: ", i);
			notas = sc.nextDouble(); 
			
			soma += notas; 
			
			media = soma / 4; 
		}
		
		System.out.printf("A média vai ser: %.2f", media);
	}

}
