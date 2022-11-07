package Funcoes_06;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fah = 0, celsius; 
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Informe um número em Celsius: ");
		celsius = sc.nextDouble(); 
		
		double converter = conversao(fah, celsius);
	}

	private static double conversao(double fah, double celsius) {
		// TODO Auto-generated method stub
		
		fah = celsius * (9.0 / 5.0) + 32.0;
		
		System.out.printf("Fahrenheit: %.2f ", fah);
		
		return fah;
	}
}
