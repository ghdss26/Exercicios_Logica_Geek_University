package Indrotucao_01;

import java.util.Scanner;

public class Ex_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario, salario_receber; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe o salário base de um funcionário: "); 
		salario = sc.nextDouble(); 
		
		salario_receber = salario + (salario * 0.05) + (salario * 0.07);
		
		System.out.printf("Salário a receber é de: %.2f", salario_receber); 
	}

}
