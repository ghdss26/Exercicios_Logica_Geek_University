package Funcoes_06;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0, n2 = 0;
		
		Soma_numero(n1, n2);
	}

	private static int Soma_numero(int n1, int n2) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 0; i < 2; i++) {
			
			System.out.printf("Informe o %d número (n1): ", i);
			n1 = sc.nextInt();
		}
		
		for(int i = 0; i < 2; i++) {
			
			System.out.printf("Informe o %d número (n2): ", i);
			n2 = sc.nextInt();
		}
		
		for(int i = 0; i < 2; i++) {
			
			if(n1 > 0 && n2 > 0) {
				
				n1 += i;
				n2 += i;
				
				soma = n1 + n2;
			}
		}
		
		System.out.printf("A soma dos números inteiros é: %d", soma);
		
		return soma;
	}

}
