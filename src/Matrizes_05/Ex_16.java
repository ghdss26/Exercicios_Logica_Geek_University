package Matrizes_05;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  
		
		int i, j;
		
		double cont = 0;
		
		double media = 0;
		
		int matricula[] = new int[3];
		
		double nota[] = new double[3];
		
		char [][] escolha = new char[5][5];
		
		char[][] gabarito = new char[5][5];
		
		for(i = 0; i < matricula.length; i++) {
			
			System.out.printf("Informe a %d matricula: ", i); 
			matricula[i] = sc.nextInt();
		}
		
		for(i = 0; i < escolha.length; i++) {
			
			for(j = 0; j < escolha.length; j++) {
				
				System.out.printf("Informe a %d escolha de resposta do Aluno na %d coluna: ", i, j);
				escolha[i][j] = sc.next().charAt(0);
			}
		}
		
		for(i = 0; i < gabarito.length; i++) {
			
			for(j = 0; j < gabarito.length; j++) {
				
				System.out.printf("Informe a %d  letra do gabarito da %d coluna: ", i, j);
				gabarito[i][j] = sc.next().charAt(0);
			}
		}
		
		for(i = 0; i < matricula.length; i++) {
			
			System.out.printf("Matricula do Aluno: [%d] = [%d] \n", i, matricula[i]); 
			
		}
		
		for(i = 0; i < escolha.length; i++) {
			
			for(j = 0; j < escolha.length; j++) {
				
				System.out.printf("Multipla escolha dos Alunos: [%d][%d] = [%c] \n", i, j, escolha[i][j]);
			}
		}
		
		for(i = 0; i < gabarito.length; i++) {
			
			for(j = 0; j < gabarito.length; j++) {
				
				System.out.printf("Gabarito das Provas: [%d][%d] = [%c] \n", i, j, gabarito[i][j]);
			}
		}
		
		for(i = 0; i < escolha.length; i++) {
			
			for(j = 0; j < escolha.length; j++) {
				
				if(escolha[i][j] == gabarito[i][j]) {
					
					cont++;
				}
			}
		}
		
		for(i = 0; i < matricula.length; i++) {
			
			for(i = 0; i < nota.length; i++) {
				
				nota[i] = cont;
				
				media += nota[i] / 2;
				
				if(media >= 7.0) {
					
					System.out.printf("Matricula do Aluno: [%d] = [%d] \n", i, matricula[i]); 
					System.out.printf("Aluno Aprovado, sua nota foi: [%d] = [%.2f] \n", i, media);
					
				} else {
					
					System.out.printf("Matricula do Aluno: [%d] = [%d] \n", i, matricula[i]); 
					System.out.printf("Aluno Reprovado, sua nota foi: [%d] = [%.2f] \n", i, media);
				}
			}
		}
	}

}
