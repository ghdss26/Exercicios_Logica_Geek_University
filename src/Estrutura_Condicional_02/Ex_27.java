package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = sc.nextInt(); 
		
		if(idade >= 5 && idade <= 7) {
			
			System.out.println("Categoria: A " + idade);
			
		} else if(idade >= 8 && idade <= 10) {
			
			System.out.println("Categoria: B " + idade);
			
		} else if(idade >= 11 && idade <= 13) {
			
			System.out.println("Juvenil: A " + idade);
			
		} else if(idade >= 14 && idade <= 17) {
			
			System.out.println("Juvenil: B " + idade);
			
		} else if(idade >= 18) {
			
			System.out.println("Sênior: " + idade);
		}
	}	

}
