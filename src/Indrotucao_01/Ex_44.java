package Indrotucao_01;

import java.util.Scanner;

public class Ex_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura_degraus, altura_alcancada, quant_degraus; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura do degrau de uma escada: "); 
		altura_degraus = sc.nextDouble(); 
		
		System.out.println("Informe a altura do degrau de uma escada: "); 
		altura_alcancada = sc.nextDouble(); 
		
		quant_degraus = altura_degraus / altura_alcancada;
		
		System.out.printf("A quantidade de degraus que o usuário vai conseguir é de: %.2f m", quant_degraus);
	}

}
