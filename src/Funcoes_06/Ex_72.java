package Funcoes_06;

import java.util.Scanner;

public class Ex_72 {

	public static void main(String[] args) {
		
		double vet1[] = new double[2];
		double vet2[] = new double[2];
		
		soma_vetores(vet1, vet2);
	}

	private static void soma_vetores(double[] vet1, double[] vet2) {
		
		Scanner sc = new Scanner(System.in);
		
		int i; 
		
		double r[] = new double[2];
		
		for(i = 0; i < vet1.length; i++) {
			
			System.out.printf("Informe a %d posição do vetor 1: ", i);
			vet1[i] = sc.nextDouble();
		}
		
		for(i = 0; i < vet2.length; i++) {
			
			System.out.printf("Informe a %d posição do vetor 2: ", i);
			vet2[i] = sc.nextDouble();
		}
		
		for(i = 0; i < r.length; i++) {
			
			r[i] = Math.cbrt(vet1[i] + vet2[i]);
			
			System.out.printf("Cálculo: [%d] = [%.2f] %n", i, r[i]);
		}
	}

}
