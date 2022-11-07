package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letras = "um,dois,três,quatro"; 
		
		int total_letras = 0;
		
		char temp;
		
		for(int i = 1; i < letras.length(); i++) {
			
			for(int j = i; j < 1000; j++) {
				
				temp = letras.charAt(i); 
				
				if(temp == letras.charAt(i)) {
					
					total_letras++;
				}
			}
		}
		
		System.out.println("Quantidade de Letras: " + total_letras);
	}

}
