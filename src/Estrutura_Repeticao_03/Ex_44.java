package Estrutura_Repeticao_03;

public class Ex_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 30, ant = 0, atual = 1, s = 0; 
		
		for(int i = 0; i < n; i++) {
			
			if(i == n) {
				
				System.out.println(ant);
				
			} else {
				
				s = ant + atual; 
				ant = atual; 
				atual = s; 
				
				System.out.println(" " + ant);
			}
		}
	}

}
