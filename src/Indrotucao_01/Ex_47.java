package Indrotucao_01;

import java.util.Scanner;

public class Ex_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; 
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt();
		
		for(int i = 0; i < numero; i++) {
			
			System.out.printf("%d \n", i);
		}
	}

}
