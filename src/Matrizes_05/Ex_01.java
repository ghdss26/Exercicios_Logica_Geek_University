package Matrizes_05;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int m[][] = new int[4][4]; 
		
		int cont = 0;
		
		for(int i = 0; i < m.length; i++) {
			
			for(int j = 0; j < m.length; j++) {
				
				System.out.printf("Informe o %d %d número da matriz: ", i, j);
				m[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i = 0; i < m.length; i++) {
			
			for(int j = 0; j < m.length; j++) {
				
				if(m[i][j] > 10) {
					
					cont++;
					System.out.println("Leitura da Matriz: " + m[i][j]);
				}
			}
		}
		
		System.out.println("Quantidade de valores: " + cont);
	}

}
