package Funcoes_06;

import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor para a: "); 
		double a = sc.nextDouble(); 
		
		System.out.println("Informe um valor para b: ");
		double b = sc.nextDouble(); 
		
		Troque(a, b);
	}

	private static void Troque(double a, double b) {
		
		System.out.println("Valor de a: " + a); 
		System.out.println("Valor de b: " + b); 
		
		System.out.println("Fazendo a troca: "); 
		
		double aux; 
		
		aux = b;
		b = a ;
		a = aux;
		
		System.out.println("Novo valor de a: " + a); 
		System.out.println("Novo valor de b: " + b); 
		
	}
}
