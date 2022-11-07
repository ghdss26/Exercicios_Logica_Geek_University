/**
 * Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e exiba na tela a média
 * destas notas. Uma nota válida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a nota não possua
 * um valor válido, este fato deve ser informado ao usuário e o programa termina.
 * 
 */

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media; 
		
		System.out.println("Informe a primeira nota: "); 
		n1 = sc.nextDouble(); 
		
		System.out.println("informe a segunda nota: "); 
		n2 = sc.nextDouble(); 
		
		if(n1 > 0 && n1 < 10 && n2 > 0 && n2 < 10) {
			
			media = (n1 + n2) / 2; 
			System.out.printf("Média do Aluno: %.2f", media);
			
		} else {
			
			System.out.println("Números inválidos");
		}
	}

}
