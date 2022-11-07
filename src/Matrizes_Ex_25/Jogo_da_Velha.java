package Matrizes_Ex_25;

import java.util.Scanner;

public class Jogo_da_Velha {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Campo cam = new Campo(); 
		
		String pos; 
		
		int autorizada = 0, Jogadas = 0;
		
		while(true) {
			
			System.out.println(":::::::::Jogo da Velha:::::::::::"); 
			cam.Visualizar(); 
			
			do {
				
				System.out.println("Jogador 1: Informe uma posição: "); 
				pos = sc.next(); 
				
				while(!cam.Verificado(pos)) {
					
					System.out.println("Jogada inválida, tente novamente !");
					
					System.out.println("Jogador 1: Informe uma posição: "); 
					pos = sc.next(); 
					
					autorizada = 0;
				}
				
				cam.Escolher(pos, "X");
				
				autorizada = 1;
				
			}while(autorizada == 0);
			
			Jogadas++;
			
			autorizada = 0;
			
			cam.Visualizar();
			
			if(!cam.Vencendor(Jogadas).equals("null")) {
				
				break;
			}
			
			do {
				
				System.out.println("Jogador 2: Informe uma posição: "); 
				pos = sc.next(); 
				
				while(!cam.Verificado(pos)) {
					
					System.out.println("Jogada inválida, tente novamente !");
					
					System.out.println("Jogador 2: Informe uma posição: "); 
					pos = sc.next(); 
					
					autorizada = 0;
				}
				
				cam.Escolher(pos, "0");
				
				autorizada = 1;
				
			}while(autorizada == 0);
			
			Jogadas++;
			
			autorizada = 0;
			
			cam.Visualizar();
			
			if(!cam.Vencendor(Jogadas).equals("null")) {
				
				break;
			}
		}
		
		System.out.println("O " + cam.Vencendor(Jogadas) + " Venceu! ");
	}

}
