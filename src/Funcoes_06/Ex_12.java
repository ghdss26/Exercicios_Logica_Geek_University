package Funcoes_06;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 251; 
		
		soma_digitos(numero);
	}

	private static int soma_digitos(int numero) {
		
		
		int soma = 0, resto = 0; 
		
		if(numero > 0) {
			
			while(numero > 0) {
				
				resto = numero % 10;
				numero = numero / 10; 
				soma = soma + resto; 
			}
			
			System.out.printf("A soma dos números inteiros é: %d", soma);
			
		} else {
			
			System.out.println("Número inválido");
		}
		
		return soma;
	}

}
