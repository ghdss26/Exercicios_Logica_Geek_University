package Matrizes_05;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int[5][5]; 
		
		int i, j, linha, coluna, n; 
		
		char verificador; 
		
		linha = 0; 
		
		coluna = 0; 
		
		verificador = 'n'; 
		
		for(i = 1; i < mat.length; i++) {
			
			for(j = 1; j < mat.length; j++) {
				
				System.out.printf("Informe a %d linha e %d coluna da matriz: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe um número a ser procurado: ");
		n = sc.nextInt();  
		
		System.out.println(""); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				if(mat[i][j] == n) {
					
					linha = i;
					coluna = j; 
					verificador = 's'; 
				}
			}
		}
		
		if(verificador == 's') {
			
			System.out.printf("Número %d encontrado na linha %d e %d coluna: ", n, linha, coluna);
			
		} else {
			
			System.out.println("Número não encontrado");
		}
	}

}
