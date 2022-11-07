package Matrizes_05;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notas[][] = new double[3][10]; 
		int i, j; 
		double menor = 0;
		int prova1, prova2, prova3; 
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < notas.length; i++) {
			
			for(j = 0; j < notas.length; j++) {
				
				System.out.printf("Nota para o aluno %d %d: ", i, j);
				notas[i][j] = sc.nextDouble(); 
			}
		}
		
		System.out.println("Relatório: "); 
		prova1 = prova2 = prova3 = 0; 
		
		for(j = 0; j < notas.length; j++) {
			
			System.out.printf("Para o aluno %d as notas foram: \n\t", j + 1); 
			menor = 10;
			
			for(i = 0; i < notas.length; i++) {
				
				if(notas[i][j] <= menor) {
					
					menor = notas[i][j]; 
				}
				
				System.out.printf("Nota para a prova %d foi = %.2f \n \t", i+1, notas[i][j]); 
			}
			
			System.out.printf("\n \t Para este aluno a Menor nota foi: %.2f", menor);
			
			for(i = 0; i < notas.length; i++) {
				
				if(menor == notas[i][j] && i == 0) {
					
					prova1++;
					break;
					
				} else if(menor == notas[i][j] && i == 1) {
					
					prova2++; 
					break; 
					
				} else if(menor == notas[i][j] && i == 2) {
					
					prova3++;
					break;
				}
			}
		}
		
		System.out.printf(" Quantidade de alunos que tiveram menor notas na prova 1 foi de %d \n", prova1);
		System.out.printf(" Quantidade de alunos que tiveram menor notas na prova 2 foi de %d \n", prova2);
		System.out.printf(" Quantidade de alunos que tiveram menor notas na prova 3 foi de %d \n", prova3);
	}
}
