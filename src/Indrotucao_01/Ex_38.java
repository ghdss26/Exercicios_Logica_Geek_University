package Indrotucao_01;

import java.util.Scanner;

public class Ex_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario, novo_salario; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu salario: "); 
		salario = sc.nextDouble(); 
		
		novo_salario = salario + (salario * 25) / 100; 
		
		System.out.printf("O novo salário do funcionario é de: %.2f", novo_salario);
	}

}
