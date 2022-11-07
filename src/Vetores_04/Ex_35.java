package Vetores_04;

import java.util.Scanner;

public class Ex_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[2];
		int b[] = new int[2];
		
		int i = 0, j = 0, u = 0, d = 0, c = 0, m = 0;
		
		int soma = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(i = 0; i < a.length; i++) {
			
			System.out.printf("Informe %d número de A: ", i);
			a[i] = sc.nextInt(); 
		}
		
		for(j = 0; j < b.length; j++) {
			
			System.out.printf("Informe %d número de B: ", j);
			b[j] = sc.nextInt(); 
		}
		
		for(i = 0; i < a.length; i++) {
			
			for(j = 0; j < b.length; j++) {
				
				u = (a[i] + b[j]) / 1 % 10;
				d = (a[i] + b[j]) / 10 % 10; 
				c = (a[i] + b[j]) / 100 % 10;
				m = (a[i] + b[j]) / 1000 % 10;
				
				soma = a[i] + b[i];
			}
		}
		
		if(u > 0 && u < 10000) {
			
			System.out.println("A unidade dos números: " + u);
		}
		
		if(d > 0 && d < 10000) {
			
			System.out.println("a dezena dos números: " + d);
		}
		
		if(c > 0 && c < 10000) {
			
			System.out.println("A centena dos números: " + c);
		}
		
		if(m > 0 && m < 10000) {
			
			System.out.println("O milhar dos números: " + m);
		}
		
		if(soma > 10) {
			
			soma = soma - 1;
			System.out.println(soma);
			
		}
		
		System.out.println("Soma dos números: " + soma);
	}
}
