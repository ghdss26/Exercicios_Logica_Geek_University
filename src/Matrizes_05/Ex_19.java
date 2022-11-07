package Matrizes_05;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matricula[][] = new int[5][4]; 
		int i, j; 
		
		double media_prova[][] = new double[5][4];
		double media_trabalho[][] = new double[5][4];
		
		double nota_final[][] = new double[5][4]; 
		
		double maior_nota = 0, quant_nota = 0, soma_nota = 0;
		
		double maior_matricula = 0, quant_matricula = 0, soma_matricula = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da Matricula: ", i, j);
				matricula[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da média das provas: ", i, j);
				media_prova[i][j] = sc.nextDouble();
			}
		}
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				System.out.printf("Informe a %d linha e a %d coluna da média dos trabalhos: ", i, j);
				media_trabalho[i][j] = sc.nextDouble();
			}
		}
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				nota_final[i][j] = (media_trabalho[i][j] + media_prova[i][j]) / 2;
			}
		}
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				System.out.printf("Linha e Coluna da nota final: [%d][%d] = [%.2f] \n",i, j, nota_final[i][j]);
			}
		}
		
		 for(i = 0; i < 3; i++) {
			 
			 for(j = 0; j < 3; j++) {
				 
				 soma_nota = quant_nota = maior_nota; 
				 soma_nota += nota_final[i][j];
				 quant_nota += 1; 
				 
				 if(quant_nota == 1) {
					 
					 maior_nota = nota_final[i][j]; 
						
				} else {
					
					if(nota_final[i][j] > maior_nota) {
							
						maior_nota = nota_final[i][j];;
					}
				 }
			 }
			 
			System.out.printf("Maior Nota final da Linha e Coluna é: %d %d = %d \n", i, j, maior_nota);
		 }
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				soma_matricula = quant_matricula = maior_matricula; 
				soma_matricula += matricula[i][j];
				
				quant_matricula += 1; 
				
				if(quant_matricula == 1) {
					
					maior_matricula = matricula[i][j]; 
					
				} else {
					
					if(matricula[i][j] > maior_matricula) {
						
						maior_matricula = matricula[i][j];;
					}
				}
			}
			
			System.out.printf("Maior Matricula final da Linha e Coluna é: %d %d = %d \n", i, j, maior_matricula);
		}
	}
}
