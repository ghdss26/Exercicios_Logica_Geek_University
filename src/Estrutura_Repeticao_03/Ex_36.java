package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n, soma, quadrado = 0, quadrado_soma = 0, diferenca = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			n = sc.nextInt();
			
			quadrado = Math.pow(n, 2); 
		}
		
		System.out.printf("Quadrado: %.2f \n", quadrado);
		
		for(int i = 0; i < 1; i++) {
			
			quadrado_soma = Math.pow(quadrado, 2);
		}
		
		System.out.printf("Quadrado da soma: %.2f \n", quadrado_soma);
		
		diferenca = quadrado_soma - quadrado;
		
		System.out.printf("Diferença: %.2f", diferenca);
	}

}
