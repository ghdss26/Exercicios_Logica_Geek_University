package Matrizes_05;

import java.util.Random;

public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(); 
		
		int i, j, l, c, aux = 1; 
		
		int n = 5;
		
		int [][]numero = new int[n][n]; 
		
		for(i = 0; i < numero.length; i++) {
			
			for(j = 0; j < numero.length; j++) {
				
				aux = 1;
				numero[i][j] = rand.nextInt() % 100;
				
				for(l = 0; l < n; l++) {
					
					for(c = 0; c < n; c++) {
						
						if((i == l && j == c) || ((l * 5) + c) > ((i * 5) + j)) {
							
							aux = 1;
							
						} else if(numero[i][j] == numero[l][c]) {
							
							aux = 0; 
							break;
						}
					}
					
					if(aux == 0) {
						
						j = j - 1; 
						break;
					}
				}
			}
		}
		
		System.out.println("Cartela Gerada: ");
		
		for(i = 0; i < numero.length; i++) {
			
			for(j = 0; j < numero.length; j++) {
				
				if(numero[i][j] > 0) {
					
					System.out.printf("Número gerado: [%d][%d] = [%d] \n", i, j, numero[i][j]);
				}
			}
		}
		
	}

}
