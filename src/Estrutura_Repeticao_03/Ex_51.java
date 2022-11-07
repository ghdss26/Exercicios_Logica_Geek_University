package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// em 1995 salario do funcionario = 2000 
		// em 1996 teve um aumento de = 1.5 % 
		// em 1997 os aumentos obtem o dobro do salario 
		
		Scanner sc = new Scanner(System.in); 
		
		int ano_atual = 2022; 
		double salario = 2000; 
		double aumento = 0.015;
		double salario_atual = 0;
		double dobro_salario = 4030;
		
		for(int ano = 1995; ano < ano_atual; ano++) {
			
			salario_atual = salario + (salario * aumento) + dobro_salario; 
		}
		
		System.out.printf("O salário atual do funciónario vai ser de: %.2f", salario_atual);
	}

}
