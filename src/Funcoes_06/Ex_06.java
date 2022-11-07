package Funcoes_06;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas = 0, minutos = 0, segundos, resto = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os segundos: ");
		segundos = sc.nextInt(); 
		
		int converter = conversao(horas, minutos, segundos, resto);
	}

	private static int conversao(int horas, int minutos, int segundos, int resto) {
		// TODO Auto-generated method stub
		
		horas = segundos / 3600; 
		resto = segundos % 3600; 
		minutos = resto / 60; 
		segundos = resto % 60; 
		
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		
		return segundos;
	}

}
