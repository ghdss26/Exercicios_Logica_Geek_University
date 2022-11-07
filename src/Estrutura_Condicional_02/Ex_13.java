package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1, nota2, nota3, media; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: "); 
		nota1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota: "); 
		nota2 = sc.nextDouble(); 
		
		System.out.println("Informe a terceira nota: "); 
		nota3 = sc.nextDouble(); 
		
		media = (nota1 * 1 + nota2 * 1 + nota3 * 2) / 2;
		
		if (media >= 60) {
			
			System.out.printf("Média Ponderada: %.2f \n", media); 
			System.out.println(" Aprovado ");
			
		} else {
			
			System.out.printf("Média Ponderada: %.2f", media, " Então foi reprovado ");
			System.out.println(" Reprovado ");
		}
	}
}
