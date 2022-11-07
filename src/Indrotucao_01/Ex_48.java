package Indrotucao_01;

import java.util.Scanner;

public class Ex_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos, segundos, resto; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os segundos: "); 
		segundos = sc.nextInt(); 
		
		horas = segundos / 3600;
		resto = segundos % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.printf("%d %d %d ", horas, minutos, segundos);
		
	}

}
