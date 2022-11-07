package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int i, j, num, E = 0, fat; 
		
		System.out.println("Informe um número: "); 
		num = sc.nextInt();
		
		for(i = 1; i < num; i++) {
			
			num = (int) (1.0 / i); 
			
			fat = 1;
			
			for(j = num; j > 0; j--) {
				
				fat *= num; 
			}
			
			E += fat;
		}
		
		System.out.printf("Euller: %d", E);
	}

}
