package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0, n, x;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("1 - Informação de um valor"); 
			System.out.println("2 - Sair \n"); 
			
			System.out.println("Informe uma opção: ");
			opcao = sc.nextInt(); 
			
			switch(opcao) {
			
			case 1: 
				
				System.out.println("Informe um número");
				n = sc.nextInt(); 
				
				if(n < 0) {
					
					System.out.println("Número inválido. Digite apenas valores positivos \n"); 
				}
				
				if(n == 0 || n == 1) {
					
					System.out.printf("%d é um caso especial \n", n);
					
				} else {
					
					if (n == 2) {
						
						System.out.println(" 2 é primo \n");
						
					} else if(n % 2 == 0) {
						
						System.out.printf("%d não é primo, pois 2 é o único número par primo \n", n);
						
					} else {
						
						x = 3; 
						
						while(x < n) {
							
							if (n % x == 0) {
								
								break;
								
							}
							
							x = x + 2;
						}
						
						if (x == n) {
							
							System.out.printf("%d é primo \n", n); 
							
						} else {
							
							System.out.printf("%d não é primo, pois é divisível por %d \n", n, x);
						}
					}
				}
				
				break; 
				
			case 2: 
				
				System.out.println("Saindo");
				break;
			}
			
		}while(opcao < 2);
	}

}
