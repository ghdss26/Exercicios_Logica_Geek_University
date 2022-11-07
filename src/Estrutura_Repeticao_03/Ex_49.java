package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario_carlos, salario_joao, renda_carlos, renda_joao; 
		
		int contador; 
		
		salario_carlos = 1212.00; 
		
		salario_joao = salario_carlos / 3; 
		
		contador = 1;
		
		renda_carlos = (salario_carlos * 0.02) + salario_carlos;
		renda_joao = (salario_joao * 0.05) + salario_joao; 
		
		while(renda_carlos < renda_joao) {
			
			renda_carlos = (renda_carlos * 0.02) + renda_carlos;
			renda_joao = (renda_joao * 0.05) + renda_joao; 
			
			contador++; 
		}
		
		System.out.printf("Quantidade de Meses: %d mês", contador);
	}
}
