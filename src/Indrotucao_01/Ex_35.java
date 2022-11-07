package Indrotucao_01;

import java.util.Scanner;

public class Ex_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, hipotenusa; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: "); 
		a = sc.nextDouble(); 
		
		System.out.println("Informe o valor de B: "); 
		b = sc.nextDouble(); 
		
		hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); 
		
		System.out.printf("O valor da Hipotenusa é: %.2f", hipotenusa); 
	}

}
