package Funcoes_06;

public class Ex_02 {

	public static void main(String[] args) {
 
		int dia = 01; 
		int mes = 01; 
		int ano = 2000;
		
		formato(dia, mes, ano);
	}

	private static int formato(int dia, int mes, int ano) {
		// TODO Auto-generated method stub
		
		String mes_extenso[] = {"de Janeiro"}; 
		
		System.out.println( dia + " " + mes_extenso[mes - 1] + " " + ano); 
		
		return 0;
	}

	
}
