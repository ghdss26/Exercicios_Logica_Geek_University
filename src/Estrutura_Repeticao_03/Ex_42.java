package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n, q = 0, rq3 = 0, rq2 = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 1; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			n = sc.nextDouble(); 
			
			q = Math.pow(n, 2);
			rq3 = Math.cbrt(n); 
			rq2 = Math.sqrt(n);
			
			if(q <= 0 && rq2 <= 0 && rq3 <= 0) {
				
				System.out.println("Valores inexistentes");
				
			} else {
				
				System.out.printf("Quadrado: %.2f \n", q);
				System.out.printf("Raiz Cúbica: %.2f \n", rq3);
				System.out.printf("Raiz Quadrada: %.2f \n", rq2);
			}
		}
	}

}
