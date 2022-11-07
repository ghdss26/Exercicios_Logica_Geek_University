package Matrizes_05;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		
		do {
			
			System.out.println("A - Somar as duas Matrizes \n"); 
			System.out.println("B - Subtrair a Primeira Matriz da Segunda \n"); 
			System.out.println("C - Substitua os valores da Sexta Coluna pela soma dos valores das colunas 1 e 2 \n"); 
			
			final double mat[][] = new double[2][2]; 
			final double mat2[][] = new double[2][2];
			
			final double mat_const[][] = new double[3][3];
			
			int i, j;
			
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("Informe a Opção que você deseja: "); 
			opcao = sc.nextInt(); 
			
			switch(opcao) {
			
			case 1: 
				
				for(i = 0; i < mat.length; i++) {
					
					for(j = 0; j < mat.length; j++) {
						
						System.out.printf("Informe a %d linha e a %d coluna da Matriz: ", i, j); 
						mat[i][j] = sc.nextDouble(); 
					}
				}
				
				for(i = 0; i < mat2.length; i++) {
					
					for(j = 0; j < mat2.length; j++) {
						
						System.out.printf("Informe a %d linha e a %d coluna da Matriz 2: ", i, j); 
						mat2[i][j] = sc.nextDouble(); 
					}
				}
				
				for(i = 0; i < mat2.length; i++) {
					
					for(j = 0; j < mat2.length; j++) {
						
						mat_const[i][j] = mat[i][j] + mat2[i][j]; 
						System.out.printf("Somátorio da linha e coluna: [%d][%d] = [%.2f] \n", i, j, mat_const[i][j]);
					}
				}
				
				break;
				
			case 2:
				
				for(i = 0; i < mat.length; i++) {
					
					for(j = 0; j < mat.length; j++) {
						
						System.out.printf("Informe a %d linha e a %d coluna da Matriz: ", i, j); 
						mat[i][j] = sc.nextDouble(); 
					}
				}
				
				for(i = 0; i < mat2.length; i++) {
					
					for(j = 0; j < mat2.length; j++) {
						
						System.out.printf("Informe a %d linha e a %d coluna da Matriz 2: ", i, j); 
						mat2[i][j] = sc.nextDouble(); 
					}
				}
				
				for(i = 0; i < mat.length; i++) {
					
					for(j = 0; j < mat.length; j++) {
						
						mat_const[i][j] = mat[i][j] - mat2[i][j]; 
						System.out.printf("Subtração da linha e coluna: [%d][%d] = [%.2f] \n", i, j, mat_const[i][j]);
					}
				}
				
				break;
				
			case 3: 
				
				for(i = 0; i < mat.length; i++) {
					
					for(j = 0; j < mat.length; j++) {
						
						System.out.printf("Informe a %d linha e a %d coluna da Matriz: ", i, j); 
						mat[i][j] = sc.nextDouble(); 
					}
				}
				
				for(i = 0; i < mat2.length; i++) {
					
					for(j = 0; j < mat2.length; j++) {
						
						System.out.printf("Informe a %d linha e a %d coluna da Matriz 2: ", i, j); 
						mat2[i][j] = sc.nextDouble(); 
					}
				}
				
				for(i = 0; i < mat.length; i++) {
					
					for(j = 0; j < mat.length; j++) {
						
						mat_const[i][j] = mat_const[i][j] + mat[i][j] + mat2[i][j]; 
						
						System.out.printf("Somátorio da linha e coluna: [%d][%d] = [%.2f] \n", i, j, mat_const[i][j]);
					}
				}
				
				break;
			}
			
		}while(opcao < 3);
	}

}
