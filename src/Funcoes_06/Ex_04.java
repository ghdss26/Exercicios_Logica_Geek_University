package Funcoes_06;

public class Ex_04 {

	public static void main(String[] args) {
	
		int n = 9, x = 3; 
		
		quadrado_perfeito(x);
		quadrado_perfeito(n);
	}

	private static void quadrado_perfeito(int x) {
		// TODO Auto-generated method stub
		
		int n1 = 1; 
		int n_total = 1; 
		
		while (n_total < x) {
			
			n1 += 2; 
			n_total = n_total + n1; 
		}
		
		if(x == n1 || x == 0) {
			
			System.out.println("Quadrado Perfeito"); 
			
		} else {
			
			System.out.println("Não é quadrado perfeito");
		}
	}
}
