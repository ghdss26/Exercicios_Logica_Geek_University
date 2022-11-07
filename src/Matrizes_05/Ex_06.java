package Matrizes_05;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat1 = new int[2][2]; 
		int[][] mat2 = new int[2][2]; 
		
		int[][] mat3 = new int[2][2];
		int[][] mat4 = new int[2][2];
		
		int soma = 0, quant = 0, maior = 0; 
		int soma1 = 0, quant1 = 0, maior1 = 0; 
		
		soma = quant = maior;
		soma1 = quant1 = maior1;
		
		int i, j = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < mat1.length; i++) {
			
			for(j = 0; j < mat1.length; j++) {
				
				System.out.printf("Informe a %d linha e %d coluna da Matriz 1: ", i, j); 
				mat1[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < mat2.length; i++) {
			
			for(j = 0; j < mat2.length; j++) {
				
				System.out.printf("Informe a %d linha e %d coluna da Matriz 2: ", i, j); 
				mat2[i][j] = sc.nextInt(); 
			}
		}
		
		for(i = 0; i < mat1.length; i++) {
			
			for(j = 0; j < mat1.length; j++) {
				
				System.out.printf("Leitura da Matriz 1: [%d] [%d] = [%d] \n", i, j, mat1[i][j]);
				
			}
		}
		
		for(i = 0; i < mat2.length; i++) {
			
			for(j = 0; j < mat2.length; j++) {
				
				System.out.printf("Leitura da Matriz 2: [%d] [%d] = [%d] \n", i, j, mat2[i][j]);
				
			}
		}
		
		for(i = 0; i < mat3.length; i++) {
			
			for(j = 0; j < mat3.length; j++) {
				
				mat3[i][j] = mat1[i][j];
				
			}
		}
		
		for(i = 0; i < mat4.length; i++) {
			
			for(j = 0; j < mat4.length; j++) {
				
				mat4[i][j] = mat2[i][j];
				
			}
		}
		
		for(i = 0; i < mat3.length; i++) {
			
			for(j = 0; j < mat3.length; j++) {
				
				soma += mat3[i][j]; 
				
				quant += 1; 
				
				if(quant == 1) {
					
					maior = mat3[i][j]; 
					
				} else {
					
					if(mat3[i][j] > maior) {
						
						maior = mat3[i][j];
					}
				}
			}
			
		}
		
		System.out.printf("Maior Valor da Linha e Coluna é na Matriz 1: %d %d = %d \n", i, j, maior);
		
		for(i = 0; i < mat4.length; i++) {
			
			for(j = 0; j < mat4.length; j++) {
				
				soma1 += mat4[i][j]; 
				
				quant1 += 1; 
				
				if(quant1 == 1) {
					
					maior1 = mat4[i][j]; 
					
				} else {
					
					if(mat4[i][j] > maior1) {
						
						maior1 = mat4[i][j];
					}
				}
			}
		}
		
		System.out.printf("Maior Valor da Linha e Coluna é na Matriz 2: %d %d = %d \n", i, j, maior1);
	}

}
