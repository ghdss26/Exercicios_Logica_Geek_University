package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custo_fabrica, custo_consumidor;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("informe o custo de fábrica: "); 
		custo_fabrica = sc.nextDouble(); 
		
		if(custo_fabrica <= 12000.00) {
			
			double custo_distribuidor1 = 0.05; 
			
			custo_consumidor = custo_fabrica + (custo_fabrica * custo_distribuidor1);
			
			System.out.printf("Custo do Consumidor: %.2f", custo_consumidor); 
			
		} else if(custo_fabrica >= 12000.00 && custo_fabrica <= 25000.00) {
			
			double custo_distribuidor2 = 0.10; 
			double impostos = 0.15; 
			
			custo_consumidor = custo_fabrica + (custo_fabrica * custo_distribuidor2) + impostos; 
			
			System.out.printf("Custo do Consumidor: %.2f", custo_consumidor); 
			
		} else if(custo_fabrica > 25000.00) {
			
			double custo_distribuidor3 = 0.15; 
			double impostos2 = 0.20; 
			
			custo_consumidor = custo_fabrica + (custo_fabrica * custo_distribuidor3) + impostos2;
			
			System.out.printf("Custo do Consumidor: %.2f", custo_consumidor); 	
		}
	}

}
