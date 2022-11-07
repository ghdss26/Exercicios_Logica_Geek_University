package Estrutura_Condicional_02;

import java.util.Random;
import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		double n1 = 0, n2 = 0, soma = 0, resposta = 0, count = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < 5; i++) {
			
			n1 = ran.nextDouble() + 1;
			n2 = ran.nextDouble() + 1; 
			
			System.out.printf("Informe a soma entre: %.2f + %.2f: ", n1, n2);
			soma = sc.nextDouble();
			
			if(resposta == soma) {
				
				count++;
				
			} else { 
				
				System.out.printf("Você errou a Questão, resposta correta é: %.2f \n", soma);
			}
		}
		
		System.out.println("Quantidade de acertos: " + count);
	}

}
