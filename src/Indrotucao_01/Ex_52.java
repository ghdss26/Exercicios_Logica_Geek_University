package Indrotucao_01;

import java.util.Scanner;

public class Ex_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String apostador_1, apostador_2, apostador_3;
		double valor_1, valor_2, valor_3;
		double valor_premio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do Primeiro investidor: ");
		apostador_1 = sc.next(); 
		
		System.out.println("Informe o nome do Segundo investidor: ");
		apostador_2 = sc.next(); 
		
		System.out.println("Informe o nome do Terceiro investidor: ");
		apostador_3 = sc.next(); 
		
		System.out.println("Informe o primeiro valor: ");
		valor_1 = sc.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		valor_2 = sc.nextDouble();
		
		System.out.println("Informe o terceiro valor: ");
		valor_3 = sc.nextDouble();
		
		double valor_premio1 = (valor_1 * valor_1) + 2 / 100;
		double valor_premio2 = (valor_2 * valor_2) + 2 / 100; 
		double valor_premio3 = (valor_3 * valor_3) + 2 / 100; 
		
		System.out.println("Premiação do Apostador: " + apostador_1 + " é de: " + valor_premio1);
		System.out.println("Premiação do Apostador: " + apostador_2 + " é de: " + valor_premio2);
		System.out.println("Premiação do Apostador: " + apostador_3 + " é de: " + valor_premio3);
	}

}
