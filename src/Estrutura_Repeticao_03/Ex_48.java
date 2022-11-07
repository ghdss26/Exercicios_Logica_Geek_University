package Estrutura_Repeticao_03;

public class Ex_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 130, ant = 0, atual = 1, f = 0; 
		
		for(int i = 0; i < n; i++) {
			
			if(i == n) {
				
				System.out.println(ant); 
				
			} else {
				
				f = ant + atual;
				ant = atual;
				atual = f;
				
				if(ant % 2 == 0 && ant <= 4000000 && ant >= 0) {
					
					System.out.printf("Sequência de Fibonnaci: %d = %d \n", i, ant);
				}
			}
		}
	}
}
