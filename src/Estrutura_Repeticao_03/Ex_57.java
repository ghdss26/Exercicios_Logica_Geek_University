package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, num, i, primo, soma = 0, cont = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a: ");
		a = sc.nextInt(); 
		
		System.out.println("Informe b: ");
		b = sc.nextInt(); 
		
		if(a > b) {
			
			i = a;
			a = b;
			b = i; 
		}
		
		for(num = a; num <= b; num++) {
			
			primo = 0; 
			
			for(i = 2; i < num; i++) {
				
				if(num % i == 0) {
					
					primo = 1;
				}
				
				if (primo == 0) {
					
					cont++;
				}
			}
		}
		
		if(cont > 0) {
			
			System.out.printf("\n Quantidade dos primos é: [%d, %d]: %d \n", a, b, cont);
			
		} else {
			
			System.out.printf("\n Não Existe primos no intervalo: [%d, %d] \n", a, b);
		}
	}
}
