package Funcoes_06;

import java.util.Scanner;

public class Ex_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[] = new int[3]; 
		
		desvio_padrao(v);
	}

	private static void desvio_padrao(int[] v) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		double soma = 0;
		double media = 0;
		double desvio = 0;
		double sq = 0; 
		double res = 0;
		
		for(n = 0; n < v.length; n++) {
			
			System.out.printf("Informe o %d número do vetor: ", n);
			v[n] = sc.nextInt(); 
		}
		
		for(n = 0; n < v.length; n++) {
			
			soma += v[n];
		}
		
		media = soma / (n); 
		
		for(n = 0; n < v.length; n++) {
			
			desvio += Math.pow((v[n] - media), 2);
		}
		
		sq = desvio / n; 
		res = Math.sqrt(sq); 
		
		System.out.printf("Desvio Padrão: %.2f", res);
	}

}
