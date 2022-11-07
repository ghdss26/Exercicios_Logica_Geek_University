/*
 * 
 * Leia o salário de um trabalhador e o valor de um empréstimo. Se a prestação for maior que 20% do salário 
 * imprima: Empréstimo não concedido, caso contrário imprima: Empréstimo concedido
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um salário da pessoa: "); 
		double salario = sc.nextDouble(); 
		
		System.out.println("Informe a prestação: "); 
		double prestacao = sc.nextDouble(); 
		
		double porcentagem = salario * 0.20; 
		
		if(prestacao > porcentagem) {
			
			System.out.println("Empréstimo não concedido"); 
			
		} else {
			
			System.out.println("Empréstimo concedido ");
		}
	}

}
