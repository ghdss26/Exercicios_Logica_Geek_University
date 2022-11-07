package Vetores_04;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo = 0;
		
		do {
			
			double[] numero = new double[5]; 
			int i, j; 
			
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("1 - Ordem direta");
			System.out.println("2 - Ordem Inversa"); 
			System.out.println("3 - Inválido");
			
			System.out.println("Informe a opção: ");
			codigo = sc.nextInt();
			
			switch (codigo) {
				
			case 1: 
				
				for(i = 0; i < numero.length; i++) {
					
					System.out.printf("Informe %d número: ", i);
					numero[i] = sc.nextDouble(); 
				}
				
				for(i = 0; i < numero.length; i++) {
					
					System.out.printf("Ordem Direta (%d) = [%.2f] ", i, numero[i]);
				}
				
				break;
				
			case 2:
				
				for(i = 0; i < numero.length; i++) {
					
					System.out.printf("Informe o %d número: ", i);
					numero[i] = sc.nextDouble();
				}
				
				for(j = 4; j >= 0; j--) {
					
					System.out.printf("Ordem inversa [%d] = [%.2f]\n", j , numero[j]);
				}
				
				break;
			}
			
		} while(codigo != 1 && codigo !=2);
		
		System.out.println("Código ínvalido");
	}

}
