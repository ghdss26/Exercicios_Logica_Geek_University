package Matrizes_05;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mat[][] = new double[3][6]; 
		
		int i, j; 
		
		double soma[][] = new double[3][6];
		
		double modificar[][] = new double[3][6];
		
		double media_aritmetica = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da Matriz: ", i, j); 
				mat[i][j] = sc.nextDouble(); 
			}
		}
		
		System.out.println("Soma de todos os elementos das colunas impares: "); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				if(mat[i][j] % 2 != 0) {
					
					soma[i][j] += mat[i][j]; 
				}
				
				System.out.printf("Somátorio da linha e coluna: [%d][%d] = [%.2f] \n", i, j, soma[i][j]); 
			}
			
		}
		
		System.out.println("Média Aritmética dos elementos da segunda e quartas colunas: "); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				media_aritmetica = (soma[0][2] + soma[1][0]) / 2; 
			}
		}
		
		System.out.printf("Média da linha e coluna: = [%.2f] \n", media_aritmetica);
		
		System.out.println("Substituição dos valores da sexta coluna pela soma dos valores das colunas 1 e 2"); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				soma[i][2] = mat[i][1] + mat[i][2];  
			}
			
			System.out.printf("Somátorio da linha e coluna: [%d][%d] = [%.2f] \n", i, j, soma[i][2]);
		}
		
		System.out.println("Matriz Modificada"); 
		
		for(i = 0; i < mat.length; i++) {
			
			for(j = 0; j < mat.length; j++) {
				
				modificar[i][2] = mat[i][0] + mat[i][1] + mat[i][2] ; 
			}
			
			System.out.printf("Somátorio da linha e coluna: [%d][%d] = [%.2f] \n", i, j, modificar[i][2]);
		}
	}

}
