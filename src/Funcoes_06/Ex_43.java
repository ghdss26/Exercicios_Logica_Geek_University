package Funcoes_06;

import java.util.Random;

public class Ex_43 {

	public static void main(String[] args) {
		
		int val = 0; 
		
		Valores(val);
	}

	private static void Valores(int val) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int vet[] = new int[3];
		
		double resultado = 0;
		
		for(val = 0; val < vet.length; val++) {
			
			vet[val] = random.nextInt(100);
		}
		
		for(val = 0; val < vet.length; val++) {
			
			if(vet[val] == vet[val]) {
				
				System.out.printf("Número Aleatório [%d] = [%d] \n", val, vet[val]);
			}
		}
	}

}
