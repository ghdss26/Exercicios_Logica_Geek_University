package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, trabalho; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a sua idade: ");
		idade = sc.nextInt(); 
		
		System.out.println("Informe o seu tempo de trabalho");
		trabalho = sc.nextInt();
		
		if(idade >= 65) {
			
			System.out.println("Pode se aposentar"); 
		}
		
		if(trabalho >= 30) {
			
			System.out.println("Aposentadoria garantida");
		}
		
		if(idade >= 60 && trabalho >= 25) {
			
			System.out.println("Aposentadoria realizada");
		}
	}

}
