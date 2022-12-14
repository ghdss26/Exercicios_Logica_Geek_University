package Funcoes_06;

public class Ex_65 {

	public static void main(String[] args) {
		
		String str1 = null;
		String str2;
		
		int N = 136;
		
		str2 = String.valueOf(N); 
		
		Comparacao(N, str1, str2);
	}

	private static void Comparacao(int n, String str1, String str2) {
		
		System.out.println("Apontando para essa String: " + str2);
		System.out.println("Terminando com caracteres nulos: " + str1);
	}
}
