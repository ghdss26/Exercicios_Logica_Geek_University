package Funcoes_06;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0; 
		
		n(n);
	}

	private static int n(int n) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		long fatorial = 1; 
		
		int i = 1; 
		
		int soma = 0, resto = 0;
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		while(i <= n) {
			
			fatorial = fatorial * i; 
			i++;
		}
		
		System.out.printf("O Fatorial de %d é: %d \n", n, fatorial);
		
		if(fatorial > 0) {
			
			while(fatorial > 0) {
				
				resto = (int) (fatorial % 10); 
				fatorial = fatorial / 10; 
				soma = soma + resto; 
			}
		}
	
		System.out.printf("A Soma dos algarismos: %d", soma);
		
		return soma;
	}

}
