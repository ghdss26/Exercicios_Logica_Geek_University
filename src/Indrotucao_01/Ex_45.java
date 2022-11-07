package Indrotucao_01;

import java.util.Scanner;

public class Ex_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma frase: "); 
		palavra = sc.next().toUpperCase(); 
		
		System.out.println("A frase vai ser: " + palavra.toLowerCase());
		
	}

}
