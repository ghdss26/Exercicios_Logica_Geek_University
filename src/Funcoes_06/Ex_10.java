package Funcoes_06;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um número para A: "); 
		a = sc.nextInt(); 
		
		System.out.println("Informe um número para B: ");
		b = sc.nextInt(); 
		
		int comparacao = Comparar(a, b);
	}

	private static int Comparar(int a, int b) {
		
		if(a > b) {
			
			System.out.println("Valor " + a + " é > " + " do que valor de: " + b);
			
		} else if( a < b) {
			
			System.out.println("Valor " + a + " é < " + " do que valor de: " + b);
		}
		
		return 0;
	}

}
