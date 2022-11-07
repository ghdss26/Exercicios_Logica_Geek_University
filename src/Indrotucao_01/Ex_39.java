package Indrotucao_01;

import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double valor = 78000.00, ganhador_1, ganhador_2, ganhador_resto; 
		
		ganhador_1 = valor + (valor * 0.46);
		ganhador_2 = valor + (valor * 0.32); 
		ganhador_resto = valor + (valor * 0.14);
		
		System.out.printf("Ganhador 1: %.2f \n", ganhador_1);
		System.out.printf("Ganhador 2: %.2f \n", ganhador_2);
		System.out.printf("Ganhador 3: %.2f", ganhador_resto);
	}

}
