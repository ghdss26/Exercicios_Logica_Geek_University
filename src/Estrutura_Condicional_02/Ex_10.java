/** 
 * 
 * Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, utilizando 
 * as seguintes fórmulas (onde h corresponde á altura) 
 * 
 * Homens: (72.7 * h) - 58
 * Mulheres: (62,1 * h) - 44,7 
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sexo; 
		double peso; 
		double h; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o peso da pessoa: "); 
		peso = sc.nextDouble(); 
		
		System.out.println("Informe a altura da pessoa: "); 
		h = sc.nextDouble(); 
		
		System.out.println("Informe o sexo da pessoa: "); 
		sexo = sc.next();
		
		if(sexo.equalsIgnoreCase("Masculino")) {
			
			double calculo_homens = (peso * h) - 58; 
			
			System.out.printf("Total: %.2f",calculo_homens ); 
			
		} else  if(sexo.equalsIgnoreCase("Feminino")){
			
			double calculo_mulheres = (peso * h) - 44.7; 
			
			System.out.printf("Total: %.2f",calculo_mulheres ); 
		}
	}

}
