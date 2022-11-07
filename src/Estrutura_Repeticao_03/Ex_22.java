package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double notas, media = 0, soma = 0; 
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe %d nota: ",  i); 
			notas = sc.nextDouble(); 
			
			soma += notas;
			
			media = soma / 10;
			
		}
		
		if(media >= 7.0) {
			
			System.out.printf("Aluno foi aprovado a sua média é: %.2f \n", media);
			
		} else {
			
			System.out.printf("Aluno foi reprovado a sua média é: %.2f \n", media);
		}
	}

}
