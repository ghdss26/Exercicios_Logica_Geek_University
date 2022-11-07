package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, nd; 
		n = nd = 10; 
		int i, achou = 0; 
		
		while(achou == 0) {
			
			achou = 1;
			
			for(i = 2; i <= n; i++) {
				
				if(nd % i != 0) {
					
					achou = 0;
					break;
				}
			}
			
			if (achou == 1) {
				
				System.out.printf("Nd = %d\n", nd); 
				
			} else {
				
				nd = nd + 2;
			}
		}
		
	}

}
