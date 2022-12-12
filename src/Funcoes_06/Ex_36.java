package Funcoes_06;

public class Ex_36 {

	public static void main(String[] args) {
		
		int n = 4;
		
		interna(n);
		superfatorial(n);
		
		System.out.println("Super Fatorial: " + superfatorial(n));
		
	}
	
	private static int interna(int n) {
		
		if(n == 0 || n == 1) {
			
			return 1;
		}
		
		return n * interna(n - 1);
	}

	private static int superfatorial(int n) {
		
		if(n == 0 || n == 1) {
			
			return 1;
		}
		
		return interna(n) * superfatorial(n - 1);
	}
}
