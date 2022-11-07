package Estrutura_Repeticao_03;

public class Ex_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6, i, j, c = 0;
		
		for(i = 0; i < n; i++) {
			
			for(j = 0; j < i; j++) {
				
				c++; 
				
				System.out.printf("%d ", c);
			}
		}
	}

}
