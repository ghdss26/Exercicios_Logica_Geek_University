package Indrotucao_01;

import java.util.Scanner;

public class Ex_53 {

	public static void main(String[] args) {
		
		double comprimento, largura, preco, custo = 0, dimensao; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o comprimento do terreno: "); 
		comprimento = sc.nextDouble(); 
		
		System.out.println("Informe a largura do terreno: "); 
		largura = sc.nextDouble(); 
		
		System.out.println("Informe o preço do metro da tela: "); 
		preco = sc.nextDouble(); 

		dimensao = (comprimento * largura) + preco; 
		
		custo += dimensao; 
		
		System.out.println(custo);
	}

}
