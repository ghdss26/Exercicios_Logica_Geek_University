package Funcoes_06;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt();
		
		System.out.println("Retorno: " + verificar(numero));
	}

	private static int verificar(int numero) {
		// TODO Auto-generated method stub
		
		if(numero < 0) {
			
			return - 1;
			
		} else if(numero > 0) {
			
			return  1; 
		}
		
		return numero;
	}

}
