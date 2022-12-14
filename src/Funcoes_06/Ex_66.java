package Funcoes_06;

public class Ex_66 {

	public static void main(String[] args) {
		
		String nome = "Gustavo Henrique";
		
		formato_maiusculo(nome);
	}

	private static void formato_maiusculo(String nome) {
		
		System.out.println("Maisculo: " + nome.toUpperCase());
	}

}
