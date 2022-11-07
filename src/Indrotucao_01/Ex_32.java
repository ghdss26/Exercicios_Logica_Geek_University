package Indrotucao_01;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, antecessor, sucessor; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt(); 
		
		antecessor = (int) (numero + Math.pow(numero, 2) - 1);
		sucessor = (int) (numero + Math.pow(numero, 3) + 1);
		
		System.out.println("Antecessor: " + antecessor); 
		System.out.println("Sucessor: " + sucessor);
	}

}
