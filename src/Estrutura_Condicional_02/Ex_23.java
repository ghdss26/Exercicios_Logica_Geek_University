package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		ano = sc.nextInt(); 
		
		if(ano % 400 == 0) {
			
			System.out.println("é Bissexto");
			
		} else if((ano % 4 == 0) && (ano % 100 != 0)) {
			
			System.out.println("é Bissexto");
			
		} else {
			
			System.out.println("Não é Bissexto");
		}
	}

}
