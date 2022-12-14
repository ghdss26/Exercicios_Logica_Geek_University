package Funcoes_06;

import java.util.Scanner;

public class Ex_73 {

	public static void main(String[] args) {
		
		int idade [] = new int[3]; 
		char sexo [] = new char[3];
		char cor_cabelos[] = new char[3]; 
		char cor_olhos[] = new char[3]; 
		
		leitura_dados(idade, sexo, cor_cabelos, cor_olhos);
		media_idade(idade, cor_olhos, cor_cabelos);
		
		int maior = maior_idade(idade);
		System.out.println("Maior idade é: " + maior);
		
		int quant_idade_F = quantidade_idade_feminino(idade, sexo, cor_olhos, cor_cabelos);
		System.out.println("Quantidade de Mulheres com idade entre 18 a 35 anos com olhos azuis e cabelos louros: " + quant_idade_F);
	}

	private static void leitura_dados(int[] idade, char[] sexo, char[] cor_cabelos, char[] cor_olhos) {
		
		Scanner sc = new Scanner(System.in);
		
		int i; 
		
		for(i = 0; i < idade.length; i++) {
			
			System.out.printf("Informe a %d idade da pessoa: ", i);
			idade[i] = sc.nextInt();
		}
		
		for(i = 0; i < sexo.length; i++) {
			
			System.out.printf("Informe o %d sexo da pessoa: ", i);
			sexo[i] = sc.next().charAt(0);
		}
		
		for(i = 0; i < cor_cabelos.length; i++) {
			
			System.out.printf("Informe a %d cor dos cabelos da pessoa: ", i);
			cor_cabelos[i] = sc.next().charAt(0);
		}
		
		for(i = 0; i < cor_olhos.length; i++) {
			
			System.out.printf("Informe a %d cor dos olhos da pessoa: ", i);
			cor_olhos[i] = sc.next().charAt(0);
		}
		
		System.out.println("Leitura dos dados: ");
		System.out.println(" ");
		
		for(i = 0; i < idade.length; i++) {
			
			System.out.printf("Idade: [%d] = [%d] %n", i, idade[i]); 
		}
		
		for(i = 0; i < sexo.length; i++) {
			
			if(sexo[i] == 'M') {
				
				System.out.printf("Sexo: [%d] = [%s] : Masculino %n", i, sexo[i]); 
				
			} else if(sexo[i] == 'F'){
				
				System.out.printf("Sexo: [%d] = [%s] : Feminino %n", i, sexo[i]);
			}
		}
		
		for(i = 0; i < cor_cabelos.length; i++) {
			
			 if(cor_cabelos[i] == 'C'){
				
				System.out.printf("Cor dos Cabelos: [%d] = [%s] : Castanhos %n", i, cor_cabelos[i]);
				
			} else if(cor_cabelos[i] == 'L'){
				
				System.out.printf("Cor dos Cabelos: [%d] = [%s] : Louros %n", i, cor_cabelos[i]);
				 
			} else if(cor_cabelos[i] == 'P'){
				
				System.out.printf("Cor dos Cabelos: [%d] = [%s] : Pretos %n", i, cor_cabelos[i]);
			}
		}
		
		for(i = 0; i < cor_olhos.length; i++) {
			
			if(cor_olhos[i] == 'A') {
				
				System.out.printf("Cor dos Olhos: [%d] = [%s] : Azuis %n", i, cor_olhos[i]);
				
			} else if(cor_olhos[i] == 'C'){
				
				System.out.printf("Cor dos Olhos: [%d] = [%s] : Castanhos %n", i, cor_olhos[i]);
			}
		}
	}

	private static void media_idade(int[] idade, char[] cor_olhos, char[] cor_cabelos) {
		
		int media = 0;
		
		int j; 
		
		for(j = 0; j < idade.length; j++) {
			
			media = idade[j] / 3;
		}
		
		for(j = 0; j < idade.length; j++) {
			
			if(media <= 50 && cor_olhos[j] == 'C' && cor_cabelos[j] == 'P') {
				
				System.out.printf("Cor dos Cabelos: [%d] = [%s] : Pretos %n", j, cor_cabelos[j]);
				System.out.printf("Cor dos Olhos: [%d] = [%s] : Castanhos %n", j, cor_olhos[j]);
			}
		}
		
		System.out.println("Média de Idade vai ser de : " + media);
	}
	
	private static int maior_idade(int[] idade) {
		
		int maior = 0, i;
		
		for(i = 0; i < idade.length; i++) {
			
			if(idade[i] > maior) {
				
				maior = idade[i];
			}
		}
		
		return maior;
	}
	
	private static int quantidade_idade_feminino(int[] idade, char[] sexo, char[] cor_olhos, char[] cor_cabelos) {
		
		int k; 
		int cont = 0;
		
		for(k = 0; k < sexo.length; k++) {
			
			if(sexo[k] == 'F' && idade[k] >= 18 && idade[k] <= 35 && cor_olhos[k] == 'A' && cor_cabelos[k] == 'L') {
				
				cont++;
			}
		}
		
		return cont;
	}
}
