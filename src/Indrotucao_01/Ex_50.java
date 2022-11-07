package Indrotucao_01;

import java.util.Scanner;

public class Ex_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, ano_atual, nascimento; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: "); 
		idade = sc.nextInt(); 
		
		System.out.println("Informe o ano atual: "); 
		ano_atual = sc.nextInt(); 
		
		nascimento = ano_atual - idade;
		
		System.out.println("Seu nascimento é de: " + nascimento);
	}

}
