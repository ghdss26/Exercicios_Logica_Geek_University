package Indrotucao_01;

import java.util.Scanner;

public class Ex_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor_hora_trabalho; 
		double numero_hora_trabalhada;
		double valor_pago;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de horas Trabalhadas em R$: "); 
		valor_hora_trabalho = sc.nextDouble(); 
		
		System.out.println("Informe o número de horas trabalhadas no mês: "); 
		numero_hora_trabalhada = sc.nextDouble();
		
		valor_pago = valor_hora_trabalho * numero_hora_trabalhada * 0.10;
		
		System.out.printf("Valor a ser pago é de: R$ %.2f", valor_pago);
	}

}
