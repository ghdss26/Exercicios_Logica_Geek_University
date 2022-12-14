package Funcoes_06;

public class Ex_64 {

	public static void main(String[] args) {
		
		String sr1 = "Gustavo Henrique "; 
		String sr2 = "De Souza Silva"; 
		
		System.out.println(Concatenacao(sr1, sr2));
	}

	private static String Concatenacao(String sr1, String sr2) {
		// TODO Auto-generated method stub
		
		String c = sr1.concat(sr2);
		
		return c;
	}

}
