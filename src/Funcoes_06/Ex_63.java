package Funcoes_06;

public class Ex_63 {

	public static void main(String[] args) {
		
		String sr1 = "Gustavo Henrique"; 
		String sr2 = "Ulisses de Souza";
		
		comparacao(sr1, sr2);

	}

	private static void comparacao(String sr1, String sr2) {
		
		if(sr1 == sr2) {
			
			System.out.println("iguais");
			
		} else {
			
			System.out.println("diferentes");
		}
	}
}
