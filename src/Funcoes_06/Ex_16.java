package Funcoes_06;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int qtd_linhas = 50; 
		
		Desenha_linha(qtd_linhas);
	}

	private static void Desenha_linha(int qtd_linhas) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < qtd_linhas; i++) {
			
			System.out.printf(" = %d", i);
		}
	}
}
