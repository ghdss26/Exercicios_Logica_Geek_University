package Funcoes_06;

import java.util.Scanner;

public class Ex_68 {

	public static void main(String[] args) {
		
		char l1[] = new char[10];
		char l2[] = new char[10];
		char l3[] = new char[20];
		
		Interpolacao(l1, l2, l3);
	}

	private static char[] Interpolacao(char[] l1, char[] l2, char[] l3) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j = 0; 
		
		for(i = 0; i < 10; i++) {
			
			System.out.printf("Informe a %d posição do vetor 1: ", i);
			l1[i] = sc.next().charAt(0);
		}
		
		for(i = 0; i < 10; i++) {
			
			System.out.printf("Informe a %d posição do vetor 2: ", i);
			l2[i] = sc.next().charAt(0);
		}
		
		for(i = 0; i < 10; i++) {
			
			l3[j] = l1[i]; 
			j++; 
			
			l3[j] = l2[i]; 
			j++; 
		}
		
		for(j = 0; j < 20; j++) {
			
			System.out.printf("Posição da Interpolação: [%d] = [%s] \n ", j, l3[j]);
		}
		
		sc.close();
		
		return l3;
	}
}
