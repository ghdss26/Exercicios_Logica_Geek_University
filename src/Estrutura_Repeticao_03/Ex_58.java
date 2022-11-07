package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, i = 0, soma = 0, primo, num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número para A: ");
		a = sc.nextInt();
		
		System.out.println("Informe um número para B: ");
		b = sc.nextInt(); 
		
		if(a > b) {
			
			i = a;
			a = b;
			b = i;
		}
		
		for(num = a; num <= b; num++) {
			
			primo = 0; 
			
			for(i = 2; i <= num; i++) {
				
				if(num % i == 0) {
					
					primo = 1;
				}
				
				if(primo == 0) {
					
					soma += num;
				}
			}
		}
		
		if(soma > 0) {
			
			System.out.printf("A soma dos números primos no intervalo de A e B é: [%d + %d] = %d", a, b, soma);
		}
	}

}
