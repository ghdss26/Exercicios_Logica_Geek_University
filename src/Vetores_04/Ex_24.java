package Vetores_04;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero_aluno[] = new double[2]; 
		double altura_aluno[] = new double[2]; 
		
		double maior_numero_aluno = 0, menor_numero_aluno = 0, soma_numero_aluno = 0; 
		double maior_altura_aluno = 0, menor_altura_aluno = 0, soma_altura_aluno = 0;
		
		int i, j, quant_numero_aluno, quant_altura_aluno;
		
		soma_numero_aluno = quant_numero_aluno = (int) (maior_numero_aluno = menor_numero_aluno);
		soma_altura_aluno = quant_altura_aluno = (int) (maior_altura_aluno = menor_altura_aluno);
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < numero_aluno.length; i++) {
			
			System.out.printf("Informe o %d número do aluno: ", i); 
			numero_aluno[i] = sc.nextDouble(); 
		}
		
		for(j = 0; j < altura_aluno.length; j++) {
			
			System.out.printf("informe o %d número da altura do aluno: ", j); 
			altura_aluno[j] = sc.nextDouble();
		}
		
		for(i = 0; i < numero_aluno.length; i++) {
			
			for(j = 0; j < altura_aluno.length; j++) {
				
				soma_numero_aluno += numero_aluno[i]; 
				soma_altura_aluno += altura_aluno[i]; 
				
				quant_numero_aluno += 1; 
				quant_altura_aluno += 1;
				
				if(quant_numero_aluno == 1 && quant_altura_aluno == 1) {
					
					maior_numero_aluno = menor_numero_aluno = numero_aluno[i]; 
					maior_altura_aluno = menor_altura_aluno = altura_aluno[j]; 
					
				} else {
					
					if(numero_aluno[i] > maior_numero_aluno) {
						
						maior_numero_aluno = numero_aluno[i]; 
						
					}
					
					if(numero_aluno[i] < menor_numero_aluno) {
						
						menor_numero_aluno = numero_aluno[i]; 
					}
					
					if(altura_aluno[j] > maior_altura_aluno) {
						
						maior_altura_aluno = altura_aluno[j];
						
					}
					
					if(altura_aluno[j] < menor_altura_aluno) {
						
						menor_altura_aluno = altura_aluno[j]; 
					}
				}
			}
		}
		
		System.out.printf("Maior número do Aluno e maior altura: %.2f e %.2f \n", maior_numero_aluno, maior_altura_aluno); 
		System.out.printf("Menor número do Aluno e menor altura: %.2f e %.2f \n", menor_numero_aluno, menor_altura_aluno);
	}

}
