package Estrutura_Repeticao_03;

import java.util.Random;
import java.util.Scanner;

public class Ex_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ram = new Random();
		
		Scanner sc = new Scanner(System.in); 
		
		int n1, numero_gerado, count = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			n1 = sc.nextInt();
			
			System.out.printf("Resposta do usuário: %d \n ", n1);
			
			numero_gerado = ram.nextInt(1000);
			
			if(n1 != numero_gerado) {
				
				System.out.printf("O usuário errou, resposta correta é: %d \n", numero_gerado);
				
			} else {
				
				System.out.println("O usuário acertou o número gerado");
				
				count++;
			}
			
			if(n1 > numero_gerado) {
				
				System.out.println("O: " + n1 + " é > que " + numero_gerado); 
				
			} else {
				
				System.out.println("O: " + n1 + " é < que " + numero_gerado);
			}
		}
		
		System.out.println("O Número foi descoberto: " + count + " Vezes");
	}

}
