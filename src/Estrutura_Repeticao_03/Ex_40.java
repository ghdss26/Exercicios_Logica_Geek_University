package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, maior = 0, menor = 0, soma = 0, quant = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			n = sc.nextInt();
			
			soma += n;
			quant += 1;
			
			if(quant == 1) {
				
				maior = menor = n;
				
			} else {
				
				if(n > maior) {
					
					maior = n;
				}
				
				if(n < menor) {
					
					menor = n;
				}
			}
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
	}

}
