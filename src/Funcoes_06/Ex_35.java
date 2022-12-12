package Funcoes_06;

public class Ex_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 11; 
		int k = 20;
		
		System.out.println("Fatorial Quadruplo: " + fatorialQuadruplo(5, 23));
	
	}

	private static int interna(int n, int k) {
		
		if(n == k) {
			
			return k;
		}
		
		return n * interna(n - 1, k);
	}

	private static int fatorialQuadruplo(int n, int k) {
		
		return interna(2 * n, n + 1);
	}

}
