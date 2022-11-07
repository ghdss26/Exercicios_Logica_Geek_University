package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero; 
		double logaritmo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt(); 
		
		if(numero < 0) {
			
			System.out.println("Número ínválido"); 
			
		} else {
			
			logaritmo = Math.log(numero); 
			
			System.out.printf("Logaritmo: %.2f", logaritmo);
		}
	}

}
