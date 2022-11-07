package Vetores_04;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] nota = new double[4]; 
		
		double soma = 0, media = 0;
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < nota.length; i++) {
			
			System.out.printf("Informe a %d nota da prova do aluno: ", i); 
			nota[i] = sc.nextDouble(); 
		}
		
		for(i = 0; i < nota.length; i++) {
			
			soma += nota[i]; 
			media = soma / 2; 
		}
		
		System.out.printf("Média do aluno: %.2f", media) ;
	}

}
