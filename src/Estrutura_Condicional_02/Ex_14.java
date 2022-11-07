package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_14 {

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
		
		media = (nota1 + nota2 + nota3) / 3; 
		
		if(media > 0 && media < 2.9) {
			
			System.out.printf("Aluno Reprovado, Média: %.2f", media);
			
		} else if(media > 3 && media < 4.9) {
			
			System.out.printf("Aluno em Recuperação, Média: %.2f", media);
			
		} else {
			
			System.out.printf("Aluno Aprovado, Média: %.2f", media);
		}
	}
}
