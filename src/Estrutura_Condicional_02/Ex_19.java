

package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número: "); 
		numero = sc.nextInt(); 
		
		if(numero % 3 == 0) {
			
			System.out.println("Divisível por 3");
			
		} else if(numero % 5 == 0) {
			
			System.out.println("Divisível por 5"); 
			
		} 
	}

}
