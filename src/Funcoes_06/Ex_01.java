package Funcoes_06;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0, dobro, calculo, resultado; 
		
		dobro = calculo(numero);
	}

	private static int calculo(int numero) {
		
		Scanner sc = new Scanner(System.in); 
		
		int resultado = 0;
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt(); 
		
		resultado = (int) Math.pow(numero, 2);
		
		System.out.printf("O Dobro do seu número é: %d", resultado );
		
		return resultado;
	}

	

}
