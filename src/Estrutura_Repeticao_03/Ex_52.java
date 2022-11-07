package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double[] notas = {100, 50, 20, 10, 2, 1};
		
		int cont = 0; 
		
		double N = 0; 
		
		System.out.println("Informe um valor para a realização do saldo: "); 
		N = sc.nextDouble();
		
		for(int i = 0; i < notas.length; i++) {
			
			cont = (int) (N / notas[i]);  
			
			N %= notas[i];
			
			System.out.println(cont + " notas(s) de R$: " + notas[i]);
		}
	}

}
