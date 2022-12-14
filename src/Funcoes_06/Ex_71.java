package Funcoes_06;

import java.util.Scanner;

public class Ex_71 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x0, x1, x;
		int y0, y1, y;
		
		System.out.println("Informe o ponto do eixo x0: ");
		x0 = sc.nextInt();
		
		System.out.println("Informe o ponto do eixo x0: ");
		x1 = sc.nextInt();
		
		System.out.println("Informe o ponto do eixo x0: ");
		x = sc.nextInt();
		
		System.out.println("Informe o ponto do eixo y0: ");
		y0 = sc.nextInt();
		
		System.out.println("Informe o ponto do eixo y1: ");
		y1 = sc.nextInt();
		
		System.out.println("Informe o ponto do eixo y: ");
		y = sc.nextInt();
		
		System.out.println("Eixo do Ponto no Retângulo: " + Retangulo(x0, x1, x, y0, y1, y));
	}

	private static int Retangulo(int x0, int x1, int x, int y0, int y1, int y) {
		
		Scanner sc = new Scanner(System.in);
		
		if(x0 <= x && x1 >= x && y0 <= y && y1 >= y) {
			
			return 1;
			
		} else {
			
			return 0;
		}
	}
}
