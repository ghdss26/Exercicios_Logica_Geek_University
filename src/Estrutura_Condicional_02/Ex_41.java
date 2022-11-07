package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso, altura, imc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu peso: "); 
		peso = sc.nextDouble(); 
		
		System.out.println("Informe a sua altura: "); 
		altura = sc.nextDouble(); 
		
		imc = peso / (altura * altura); 
		
		System.out.printf("Imc: %.2f \n", imc);
		
		if(imc <= 18.5) {
			
			System.out.println("Abaixo do Peso"); 
			
		} else if(imc >= 18.6 && imc <= 24.9) {
			
			System.out.println("Saudável"); 
			
		} else if(imc >= 25.0 && imc <= 29.9) {
			
			System.out.println("Peso em excesso"); 
			
		} else if(imc >= 30.0 && imc <= 34.9) {
			
			System.out.println("Obesidade Grau 1"); 
			
		} else if(imc >= 35.0 && imc <= 39.9) {
			
			System.out.println("Obesidade Grau 2 (Severa)"); 
			
		} else if(imc >= 40.0) {
			
			System.out.println("Obesidade Grau 3 (Mórbida)");
		}
		
	}

}
