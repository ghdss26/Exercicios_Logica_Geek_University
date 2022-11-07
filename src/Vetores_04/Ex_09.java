package Vetores_04;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double[] numero = new double[6];
		
		int i, j; 
		
		for(i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			numero[i] = sc.nextDouble();
		}
		
		System.out.println(" ");
		System.out.println("Ordem inversa: \n");
		
		for(j = 5; j >= 0; j--) {
			
			if(numero[j] % 2 == 0) {
				
				System.out.printf("Ordem [%d] = [%.2f] \n", j, numero[j]);
			}
		}
	}

}
