package Vetores_04;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vet[] = new int[10]; 
		
		int x;
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < vet.length; i++) {
			
			System.out.printf("Informe o %d número do vetor: ", i);
			vet[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < vet.length; i++) {
			
			if(vet[i] < 0) {
				
				System.out.println(" Número ínválido, Digite apenas números positivos \n");
			}
			
			if(vet[i] == 0 || vet[i] == 1) {
				
				System.out.printf(" %d é um caso especial \n", vet[i]);
				
			} else {
				
				if(vet[i] == 2) {
					
					System.out.println(" 2 é Primo: \n");
					
				} else if(vet[i] % 2 == 0) {
					
					System.out.printf(" %d não é primo, pois 2 é o único número par primo \n ", vet[i]); 
					
				} else {
					
					x = 3;
					
					while(x < vet[i]) {
						
						if(vet[i] % x == 0) {
							
							break;
						}
						
						x = x + 2;
					}
					
					if(x == vet[i]) {
						
						System.out.printf(" %d é primo", vet[i]);
						
					} else {
						
						System.out.printf(" %d não é primo, pois é divisível por %d ", vet[i], x);
					}
				}
			}
		}
	}
}
