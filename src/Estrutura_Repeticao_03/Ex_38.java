package Estrutura_Repeticao_03;

public class Ex_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1000, a, b, c = 0; 
		
		for(a = 3; a < n; a++) {
			
			for(b = 2; b < n; b++) {
				
				for(c = 0; c < n; c++) {
					
					if(a*a + b*b == c*c) {
						
						System.out.println("a = " + a + "\nb = " + b + "\n c = " + c);
					}
				}
			}
		}
	}
}
