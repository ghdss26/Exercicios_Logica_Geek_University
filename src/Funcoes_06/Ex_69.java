package Funcoes_06;

import java.util.Scanner;

public class Ex_69 {

	public static void main(String[] args) {
		
		int opcao;
		
		do {
			
			System.out.println("Menu de Opções");
			System.out.println(" ");
			System.out.println("1 - Frações");
			System.out.println("2 - Máximo Divisor Comun");
			System.out.println("3 - Soma");
			System.out.println("4 - Subtração");
			System.out.println("5 - Produto");
			System.out.println("6 - Quociente");
			
			System.out.println(" ");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe uma oção: "); 
			opcao = sc.nextInt();
			
			double p = 0, q = 0; 
			
			switch(opcao) {
			
			case 1:
				
				numerado_denominador(p, q);
				
				break;
				
			case 2: 
				
				System.out.println("Máximo Divisor Comum: " + MMC(p, q)); 
				
				break;
			
			case 3:
				
				System.out.println("Somatório: " + soma(p,q));
				
				break;
				
			case 4: 
				
				System.out.println("Subtração: " + subtracao(p,q));
				
				break;
				
			case 5: 
				
				produto(p,q);
				
				break;
			
			case 6: 
				
				System.out.println("Quociente: " + quociente(p, q));
				break;
			}
			
		}while(opcao != 6 );
	}

	private static void numerado_denominador(double p, double q) {
		
		Scanner sc = new Scanner(System.in);
		
		int i; 
		
		double f = 0;
		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Informe o numerador: "); 
			p = sc.nextDouble();  
		}
		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Informe o denominador: "); 
			q = sc.nextDouble();  
		}
		
		for(i = 0; i < 1; i++) {
			
			f = (p / q) + i; 
		}
		
		System.out.printf("Fração: %.2f \n", f);
	}
	
	private static double MMC(double p, double q) {
		
		Scanner sc = new Scanner(System.in);
		
		double resto;
		
		System.out.println("Informe o numerador: "); 
		p = sc.nextDouble(); 
		
		System.out.println("Informe o denominador: "); 
		q = sc.nextDouble();  
		
		while(q != 0) {
			
			resto = p % q; 
			p = q; 
			q = resto; 
		}
		
		return p;
	}
	
	private static double soma(double p, double q) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		System.out.println("Informe o numerador: "); 
		p = sc.nextDouble(); 
		
		System.out.println("Informe o denominador: "); 
		q = sc.nextDouble();  
		
		soma = p + q; 
		
		return soma;
	}
	
	private static double subtracao(double p, double q) {
		
		Scanner sc = new Scanner(System.in);
		
		double subtracao = 0;
		
		System.out.println("Informe o numerador: "); 
		p = sc.nextDouble(); 
		
		System.out.println("Informe o denominador: "); 
		q = sc.nextDouble();  
		
		subtracao = p - q; 
		
		return subtracao;
	}
	
	private static void produto(double p, double q) {
		
		Scanner sc = new Scanner(System.in);
		
		int i; 
		
		double f = 0;
		double produto = 0;
		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Informe o numerador: "); 
			p = sc.nextDouble();  
		}
		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Informe o denominador: "); 
			q = sc.nextDouble();  
		}
		
		for(i = 1; i < 2; i++) {
			
			f = p / q; 
			
			produto = f * i;
		}
		
		System.out.printf("Produto: %.2f \n", produto);
		
	}
	
	private static double quociente(double p, double q) {
		
		Scanner sc = new Scanner(System.in);
		
		int i; 
		
		double quociente = 0;
		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Informe o numerador: "); 
			p = sc.nextDouble();  
		}
		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Informe o denominador: "); 
			q = sc.nextDouble();  
		}
		
		for(i = 1; i < 2; i++) {
			
			quociente = p / q; 
		}
		
		return quociente;
	}

}
