package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia, mes, ano, nasc, anoAtual = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia: "); 
		dia = sc.nextInt(); 
		
		System.out.println("Informe o mês: ");
		mes = sc.nextInt(); 
		
		System.out.println("Informe o ano: ");
		ano = sc.nextInt(); 
		
		if(dia > 0 && dia <= 28 && anoAtual == 2008 && mes > 0 && mes < 13) {
			
			nasc = anoAtual - ano; 
			System.out.println("Data válida "); 
			
		} else {
			
			System.out.println("Data inválida");
		}
		
		if(dia < 29 && anoAtual == 2008 && mes > 0 && mes < 13 ) {
			
			if(ano % 400 == 0) {
				
				System.out.println("é Bissexto");
				
			} else if((ano % 4 == 0) && (ano % 100 != 0)) {
				
				System.out.println("é Bissexto");
				
			} else {
				
				System.out.println("Não é Bissexto");
			}
		}
		
		if(dia < 30 && anoAtual == 2008 && mes > 0 && mes < 13) {
			
			System.out.println("Data válida ");
			
		} else {
			
			System.out.println("Data inválida ");
		}
	}	

}
