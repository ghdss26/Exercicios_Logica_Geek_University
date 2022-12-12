package Funcoes_06;

public class Ex_62 {

	public static void main(String[] args) {
		
		int t = comprimento_assinatura("void tamanho(char *str, int *strsize)");
		
		System.out.println("Comprimento de uma String: " + t);
	}

	private static int comprimento_assinatura(String string) {
		
		int i; 
		
		int calculo = 0;
		
		for(i = 0; i < string.length(); i++) {
			
			calculo = string.codePointAt(i);
		}
		
		return calculo;
	}
}
