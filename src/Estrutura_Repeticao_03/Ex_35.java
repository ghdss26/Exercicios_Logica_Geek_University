package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor_intervalo_inicial = 0, valor_intervalo_final = 0, soma = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Informe %d o valor: ", i); 
			valor_intervalo_inicial = sc.nextInt();
			
			System.out.printf("Informe %d o valor: ", i); 
			valor_intervalo_final = sc.nextInt();
			
			if(valor_intervalo_inicial > valor_intervalo_final) {
				
				break;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(valor_intervalo_inicial % 2 == 0 && valor_intervalo_final % 2 == 0) {
				
				soma = valor_intervalo_inicial + valor_intervalo_final;
			}
		}
		
		System.out.printf(" Soma: %.2f \n", soma);
	}

}
