package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario_atual, valor_geral;
		int tempo_servico; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do Salário: "); 
		salario_atual = sc.nextDouble(); 
		
		System.out.println("Informe o tempo de serviço: "); 
		tempo_servico = sc.nextInt(); 
		
		if(salario_atual < 500.00 && tempo_servico <= 1) {
			
			valor_geral = salario_atual + (salario_atual * 0.25); 
			
			System.out.printf("Valor Geral: %.2f\n", valor_geral); 
			System.out.println("Bônus: Sem bônus");
			
		} else if(salario_atual <= 1000.00 && tempo_servico >= 1 && tempo_servico <= 3) {
			
			valor_geral = (salario_atual + ((salario_atual * 0.20) + 100));
			
			System.out.printf("Valor Geral: %.2f", valor_geral); 
			
		} else if(salario_atual <= 1500.00 && tempo_servico  >= 4 && tempo_servico <= 6) {
			
			valor_geral = (salario_atual + ((salario_atual * 0.15) + 200));
			
			System.out.printf("Valor Geral: %.2f", valor_geral); 
			
		} else if(salario_atual <= 2000.00 && tempo_servico >= 7 && tempo_servico <= 10) {
			
			valor_geral = (salario_atual + ((salario_atual * 0.15) + 300));
			
			System.out.printf("Valor Geral: %.2f", valor_geral); 
			
		} else if(salario_atual >= 2000.00 && tempo_servico >= 10) {
			
			valor_geral = salario_atual + (salario_atual + 500);
			System.out.println("Reajuste: Sem Reajuste \n");
			System.out.printf("Valor Geral: %.2f", valor_geral); 
		}
		
	}

}
