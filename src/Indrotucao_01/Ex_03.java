// Peça para o usuário digitar três números, imprimir o número deles 

package Indrotucao_01;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		double numero;
		
		for(int i = 0; i < 3; i++) {
			
			System.out.printf("Informe %d número: ", i); 
			numero = sc.nextInt(); 	
			
			soma += numero;
		}
		
		System.out.println(soma);
	}

}
