package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double idade, media = 0, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++ ) {
			
			System.out.printf("informe a %d idade das pessoas: ", i);
			idade = sc.nextDouble(); 
			
			if(idade == 0) {
				
				break;
			}
			
			soma += idade;
			media = soma / 5;
 		}
		
		System.out.printf("Media: %.2f", media);
	}

}
