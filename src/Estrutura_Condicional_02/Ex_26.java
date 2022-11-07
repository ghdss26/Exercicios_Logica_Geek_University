package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distancia; 
		double qtd_litros; 
		double consumo; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a distância percorrida: "); 
		distancia = sc.nextDouble(); 
		
		System.out.println("Informe a quantidade de litros: "); 
		qtd_litros = sc.nextDouble(); 
		
		consumo = distancia / qtd_litros;
		
		if(consumo < 8) {
			
			System.out.println("Venda o carro");
			
		} else if(consumo >= 8 && consumo <= 14) {
			
			System.out.println("Econômico"); 
			
		} else if(consumo > 12) {
			
			System.out.println("Super Econômico");
		}
	}

}
