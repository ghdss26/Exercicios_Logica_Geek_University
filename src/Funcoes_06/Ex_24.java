package Funcoes_06;

public class Ex_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6; 
		
		triangulo_angulo(n);
	}

	private static void triangulo_angulo(int n) {
		// TODO Auto-generated method stub
		
		int i = 0, j = 0; 
		
		for(i = 2; i < n; i++) {
			
			for(j = n + i; j >= 2 + i; j++) {
				
				for(j = 2; j <= i; j++) {
					
					System.out.println(" * ");
				}
				
				System.out.println(" ");
				break;
			}
		}
	}

}
