package Indrotucao_01;

import java.util.Scanner;

public class Ex_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, i = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt(); 
		
		while(numero > 0) {
			
			i *= 10;
			i += (numero % 10);
			numero /= 10;
		}
		
		System.out.println(i);
	}

}
