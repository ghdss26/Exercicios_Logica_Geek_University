package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, resultado, k = 0, s = 2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt();
		
		for(int i = 0; i < numero; i = numero + 1) {
			
			for(int j = 1; j < numero; j = numero + 1) {
				
				s = s + (i / fatorial_series(j * 2, i, j));
			}
		}
		
		System.out.println("Número da Série: " + s);
	}
	
	public static int fatorial_series(int resultado, int numero, int k) {
		
		resultado = 1; 
		
		for(k = 2; k < numero; k = numero + 1) {
			
			resultado *= k; 
		}
		
		return resultado;
	}

}
