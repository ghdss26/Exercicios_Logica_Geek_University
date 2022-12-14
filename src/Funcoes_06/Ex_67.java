package Funcoes_06;

import java.util.Scanner;

public class Ex_67 {

	public static void main(String[] args) {
		
		char vet[] = new char[3]; 
		
		int i = 0;
		int cont = 0;
		
		getchar(i, vet, cont);

	}

	private static void getchar(int i, char[] vet, int cont) {
		
		int g;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < vet.length; i++) {
			
			System.out.printf("Informe as letras %s: ", i);
			vet[i] = sc.next().charAt(0);
		}
		
		for(i = 0; i < vet.length; i++) {
			
			System.out.printf("Letras de Caracteres: [%d] = [%s] ", i, vet[i]);
			cont++;
		}
		
		System.out.println("Quantidade: " + cont);
	}

}
