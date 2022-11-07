package Funcoes_06;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distancia = 0, q_litros = 0, consumo = 0; 
		
		distancia_km(distancia, q_litros, consumo);
	}

	private static double distancia_km(double distancia, double q_litros, double consumo) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a distância Percorrida em Km: ");
		distancia = sc.nextDouble(); 
		
		System.out.println("Informe a quantidade de litros: "); 
		q_litros = sc.nextDouble(); 
		
		consumo = distancia / q_litros;
		
		System.out.printf("Consumo do carro é: %.2f \n", consumo);
		
		if(consumo <= 8) {
			
			System.out.println("Venda o carro ! ");
			
		} else if(consumo >= 8.1 && consumo <= 11.9) {
			
			System.out.println("Econômico !"); 
			
		} else if(consumo >= 12) {
			
			System.out.println("Super econômico !"); 
		}
		
		return consumo;
	}

}
