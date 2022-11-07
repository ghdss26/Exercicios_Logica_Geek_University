package Indrotucao_01;

import java.util.Scanner;

public class Ex_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, y, r, distancia_x, distancia_y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a coordenada de x: ");
		x = sc.nextDouble(); 
		
		System.out.println("Informe a coordenada de y: ");
		y = sc.nextDouble(); 
		
		System.out.println("Informe o ponto do R: ");
		r = sc.nextDouble(); 
		
		distancia_x = x + Math.pow(r, 2); 
		distancia_y = y + Math.pow(r, 2);
		
		System.out.println("Coordenadas: " + "(" + distancia_x + "," + distancia_y + ")");
	}

}
