package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int h_entrada, m_entrada, h_saida, m_saida, hora_final, minuto_final, tempo_minutos; 
		double preco;
		
		System.out.println("Informe a hora de entrada: "); 
		h_entrada = sc.nextInt(); 
		
		System.out.println("Informe os minutos de entrada: "); 
		m_entrada = sc.nextInt();
		
		System.out.println("Informe a hora de saída: ");
		h_saida = sc.nextInt(); 
		
		System.out.println("Informe os minutos de saída: "); 
		m_saida = sc.nextInt(); 
		
		if(h_entrada > h_saida) {
			
			hora_final = (h_saida + 24) - h_entrada; 
			
		} else {
			
			hora_final = h_saida - h_entrada; 
		}
		
		if(m_entrada > m_saida) {
			
			minuto_final = (m_saida + 60) - m_entrada;
			
		} else {
			
			minuto_final = m_saida - m_entrada; 
		}
		
		System.out.printf("A permanência foi de: %d \n", hora_final);
		System.out.printf("minutos foi: %d \n", minuto_final);
		
		tempo_minutos = hora_final * 60 + minuto_final;
		
		if(1 <= tempo_minutos && tempo_minutos <= 60) {
			
			preco = 1; 
			
			System.out.printf("O valor a ser pago será de R$: %.2f", preco);
			
		} else if(60 <= tempo_minutos && tempo_minutos <= 60) {
			
			preco = 2; 
			System.out.printf("O valor a ser pago será de R$: %.2f", preco);
			
		} else if(60 <= tempo_minutos && tempo_minutos <= 120) {
			
			preco = 4.2; 
			System.out.printf("O valor a ser pago será de R$: %.2f", preco); 
			
		} else if(180 <= tempo_minutos && tempo_minutos <= 240) {
			
			preco = 5.6; 
			System.out.printf("O valor a ser pago será de R$: %.2f", preco);
			
		} else if(tempo_minutos > 240) {
			
			preco = hora_final * 2; 
			System.out.printf("O valor a ser pago será de R$: %.2f", preco); 
			
		} else {
			
			System.out.println("Tem de permanência mínimo, não será necessário pagar !"); 
		}
	}
}
