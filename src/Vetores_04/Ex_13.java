package Vetores_04;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] numero = new double[5]; 
		
		double maior = 0, menor = 0, soma = 0, quant = 0, n;
		
		int posicao_maior = 0, posicao_menor = 0;
		
		soma = quant = maior = menor;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			numero[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Números lidos [%d]: %.2f \n", i, numero[i]); 
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			 soma += numero[i]; 
			 
			 quant += 1; 
			 
			 if(quant == 1) {
				 
				 maior = menor = numero[i];
				 
			 } else {
				 
				 if(numero[i] > maior) {
					 
					 maior = numero[i];
					 posicao_maior++;
				 }
				 
				 if(numero[i] < menor) {
					 
					 menor = numero[i];
					 posicao_menor++;
				 }
			 }
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		
		System.out.println("Posição Maior: " + posicao_maior);
		System.out.println("Posição Menor: " + posicao_menor);
	}

}
