package Funcoes_06;

import java.util.Scanner;

public class Ex_70 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p, q;
		
		System.out.println("Redução de Número Racional: " + reduz(100, 8));
		System.out.println("Negação de X: " + neg(100));
		System.out.println("Soma de x + y: " + soma(50, 60));
		System.out.println("Produto Interno de x * y: " + mult(10,3));
		System.out.println("Quociente da divisão, usando resto: " + quociente(100, 61));
	}

	private static int reduz(int p, int q) {
	
		int a = p; 
		int b = q; 
		
		return a / b;
	}
	
	private static int neg(int p) {
		
		int x = p; 
		
		return -x;
	}
	
	private static int soma(int p, int q) {
		
		int x = p; 
		int y = q; 
		
		int soma; 
		
		return soma = x + y;
	}
	
	private static int mult(int p, int q) {
		
		int x = p;
		int y = q; 
		
		int produto; 
		
		produto = x * y;
		
		
		return  produto ;
	}
	
	private static int  quociente(int p, int q) {
		
		int quociente = 0; 
		
		int x = p; 
		int y = q; 
		
		int resto;
		
		quociente = x / y;
		
		resto = x % y;
		
		return resto;
	}


}
