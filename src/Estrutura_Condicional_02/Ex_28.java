package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1 - Geométrica \n");
		System.out.println("2 - Ponderada \n");
		System.out.println("3 - Harmônica \n");
		System.out.println("4 - Aritmética \n"); 
		
		int opcao; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe uma opção: ");
		opcao = sc.nextInt(); 
		
		switch(opcao) {
		
		case 1: 
			
			double x, y, z; 
			
			System.out.println("Informe o valor de X: ");
			x = sc.nextDouble(); 
			
			System.out.println("Informe o valor de y: ");
			y = sc.nextDouble();
			
			System.out.println("Informe o valor de z: ");
			z = sc.nextDouble();
			
			double Geométrica = Math.cbrt(x) * Math.cbrt(y) * Math.cbrt(z); 
			
			System.out.printf("Geométrica: %.2f", Geométrica);
			
			break; 
			
		case 2: 
			
			double x1, y1, z1;
 
			System.out.println("Informe o valor de X: ");
			x1 = sc.nextDouble(); 
			
			System.out.println("Informe o valor de y: ");
			y1 = sc.nextDouble();
			
			System.out.println("Informe o valor de z: ");
			z1 = sc.nextDouble();
			
			double Ponderada = x1 + 2 * y1 + 3 * z1 / 6; 
			
			System.out.printf("Geométrica: %.2f", Ponderada);
			
			break;
			
		case 3: 
			
			double x2, y2, z2; 
			
			System.out.println("Informe o valor de X: ");
			x2 = sc.nextDouble(); 
			
			System.out.println("Informe o valor de y: ");
			y2 = sc.nextDouble();
			
			System.out.println("Informe o valor de z: ");
			z2 = sc.nextDouble();
			
			double Harmônica = 1 / 1 / x2 + 1 / y2 + 1 / z2;
			
			break;
			
		case 4: 
			
			double x3, y3, z3; 
			
			System.out.println("Informe o valor de X: ");
			x3 = sc.nextDouble(); 
			
			System.out.println("Informe o valor de y: ");
			y3 = sc.nextDouble();
			
			System.out.println("Informe o valor de z: ");
			z3 = sc.nextDouble();
			
			double Aritmética = x3 + y3 + z3 / 3; 
			
			System.out.printf("Aritmética: %.2f", Aritmética);
		}
		
	}

}
