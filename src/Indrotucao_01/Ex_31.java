package Indrotucao_01;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, antecessor, sucessor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("Antecessor: " + antecessor); 
		System.out.println("Sucessor: " + sucessor);
	}

}
