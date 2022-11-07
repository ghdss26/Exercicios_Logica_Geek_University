package Indrotucao_01;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double l, a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: "); 
		l = sc.nextDouble(); 
		
		a = l * l; 
		
		System.out.printf("Número de Lados: %.2f", a);
	}

}
