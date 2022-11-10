package Funcoes_06;

public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long r = maior_fator_primo(34523l);
		
		System.out.println("Maior fator Primo: " + r);
	}

	private static long maior_fator_primo(long a) {
		
		long r = a; 
		
		for(int i = 2; i < Math.sqrt(a); i++) {
			
			if(a % i == 0) {
				
				return maior_fator_primo(a / i); 
			}
		}
		
		return r;
	}
}
