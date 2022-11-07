package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int semana; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: "); 
		semana = sc.nextInt(); 
		
		switch(semana) {
		
		case 1: 
			
			System.out.println("Domingo"); 
			break;
			
		case 2:
			
			System.out.println("Segunda"); 
			break;
			
		case 3: 
			
			System.out.println("Terça"); 
			break;
			
		case 4: 
			
			System.out.println("Quarta Feira"); 
			break;
			
		case 5: 
			
			System.out.println("Quinta Feira"); 
			break;
			
		case 6:
			
			System.out.println("Sexta Feira"); 
			break;
			
		case 7: 
			
			System.out.println("Sábado");
			break;
			
		case 8:
			
			System.out.println("Domingo");
			break;
		}
		
	}

}
