/**
 * 
 * Faça um algoritmo utilizando o comando while que mostra uma contagem regressiva 
 * na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem "FIM!" após a contagem 
 */

package Estrutura_Repeticao_03;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 10;
		
		for(int i = 0; numero > 0; i++) {
			
			numero = numero - 1;
			
			System.out.println(numero);
		}
		
		System.out.println("FIM");
	}

}
