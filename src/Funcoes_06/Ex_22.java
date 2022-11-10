package Funcoes_06;

public class Ex_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5; 
		
		exclamacao(n);
	}

	private static void exclamacao(int n) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < n; i++) {
			
			for(int j = 0; j < i * 1; j++) {
				
				System.out.println(" ");
				System.out.println(" ! ");
			}
		}
	}
}
