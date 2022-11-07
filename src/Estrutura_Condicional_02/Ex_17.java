package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double baseMenor, baseMaior, altura, A;
		
		System.out.println("Informe a base menor: "); 
		baseMenor = sc.nextDouble();
		
		System.out.println("Informe a base maior: "); 
		baseMaior = sc.nextDouble(); 
		
		System.out.println("Informe a altura: "); 
		altura = sc.nextDouble(); 
		
		if(baseMenor > 0 && baseMaior > 0 && altura > 0) {
			
			A = (baseMenor + baseMaior) * altura / 2; 
			
			System.out.printf("A: %.2f", A);
			 
		} else {
			
			System.out.println("Número ínválido");
		}
	}

}
