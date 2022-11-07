package Vetores_04;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double[] numero = new double[10]; 
		
		double aux = 0;
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < numero.length; i++) {
			
			for(int j = i + 1; j < numero.length; j++) {
				
				if(numero[j] == numero[i]) {
					
					aux = numero[i];
					
					System.out.printf("[%d] Número repetido = [%.2f] \n", i, aux);
					
				} 
			}
		}
	}

}
