package Estrutura_Repeticao_03;

import java.util.Scanner;

public class Ex_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double R1 = 0, R2 = 0, R = 0; 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 1; i++) {
			
			System.out.printf("Informe o %d Resistor: ", i);
			R1 = sc.nextDouble(); 
			
			System.out.printf("Informe o %d Resistor: ", i);
			R2 = sc.nextDouble(); 
			
			R = (R1 * R2) / R1 + R2; 
			
			if(R <= 0) {
				
				System.out.println("Proibido");
				break;
				
			} else {
				
				System.out.printf("Resistor: %.2f", R);	
			}
			
		}	
	}

}
