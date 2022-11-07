package Estrutura_Repeticao_03;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1000;
		int contador = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println("Números Pares: " + i); 
				contador++;
			}
		}
		
		System.out.println("Número de dados lidos: " + contador);
	}

}
