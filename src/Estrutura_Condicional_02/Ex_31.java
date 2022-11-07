

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso, altura; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o peso da pessoa: ");
		peso = sc.nextDouble(); 
		
		System.out.println("Informe a altura da pessoa: ");
		altura = sc.nextDouble(); 
		
		// Tabela - Coluna 1 Peso = 60
		if(altura < 1.20 && peso < 60) {
			
			System.out.println("Catégoria A");
			
		} else if(altura < 1.70 && peso < 60) {
			
			System.out.println("Catégoria B");
			
		} else if(altura > 1.70 && peso < 60) {
			
			System.out.println("Catégoria C");
		}
		
		// Tabela - Coluna 2 Peso < 90
		if(altura < 1.20 && peso < 90) {
			
			System.out.println("Catégoria D");
			
		} else if(altura < 1.70 && peso < 90) {
			
			System.out.println("Catégoria E"); 
			
		} else if(altura > 1.70 && peso < 90) {
			
			System.out.println("Catégoria F"); 
		}
		
		// Tabela - Coluna 3 Peso > 90
		
		if(altura < 1.20 && peso > 90) {
			
			System.out.println("Catégoria G");
			
		} else if(altura < 1.70 && peso > 90) {
			
			System.out.println("Catégoria H"); 
			
		} else if(altura > 1.70 && peso > 90) {
			
			System.out.println("Catégoria I"); 
		}
	}

}
