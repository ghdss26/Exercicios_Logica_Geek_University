package Funcoes_06;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura, raio, pi = 3.14, volume = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a altura do cilindro: "); 
		altura = sc.nextDouble(); 
		
		System.out.println("Informe o raio do cilindro: ");
		raio = sc.nextDouble(); 
		
		double calculo = Calculo_Volume(altura, raio, volume, pi);
	}

	private static double Calculo_Volume(double altura, double raio, double volume, double pi) {
		
		volume = pi * Math.pow(raio, 2) * altura; 
		
		System.out.printf("Volume: %.2f", volume);
		
		return volume;
	}

}
