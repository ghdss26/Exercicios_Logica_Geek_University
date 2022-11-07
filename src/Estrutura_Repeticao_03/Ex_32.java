package Estrutura_Repeticao_03;

import java.util.Random;
import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		int d1 = 0, d2 = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <= 5; i++) {
			
			d1 = ran.nextInt(10); 
			d2 = ran.nextInt(10); 
			
			if(d1 == d2) {
				
				System.out.println("Usuario d1: " + d1 + " empatou do usuário d2: " + d2); 
				
			} else if(d1 > d2) {
				
				System.out.println("Usuário d1: " + d1 + " Ganhou do usuário d2: " + d2);
				
			} else if(d1 < d2){
				
				System.out.println("Usuário d2: " + d2 + " Ganhou do usuário d1: " + d1);
			}
		}
		
	}

}
