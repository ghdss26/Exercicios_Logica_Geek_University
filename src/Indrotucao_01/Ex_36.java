package Indrotucao_01;

import java.util.Scanner;

public class Ex_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura, raio, volume, pi = 3.14; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura: "); 
		altura = sc.nextDouble(); 
		
		System.out.println("Informe o raio: ");
		raio = sc.nextDouble();
		
		volume = pi * Math.pow(raio, 2) * altura;
		
		System.out.printf("Volume de um cilindro: %.2f", volume);
	}

}
