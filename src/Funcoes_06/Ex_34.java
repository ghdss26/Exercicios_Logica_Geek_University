package Funcoes_06;

public class Ex_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5; 
		
		System.out.println(fatDuplo(5));
		
		fatDuplo(n);
	}

	private static int fatDuplo(int n) {
		
		if(n == 1) {
			
			return 1;
			
		}
		
		if(n % 2 == 0) {
			
			return 0;
		}
		
		return n * fatDuplo(n - 2);
		
	}
}
