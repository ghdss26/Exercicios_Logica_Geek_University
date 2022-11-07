package Vetores_04;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero[] = new int[50]; 
		
		int i;
		
		for(i = 0; i < numero.length; i++) {
			
			numero[i] = (i + 5 * i) % (i + 1);
		}
		
		for(i = 0; i < numero.length; i++) {
			
			System.out.printf("Posição %d = %d \n", i, numero[i]);
		}
	}

}
