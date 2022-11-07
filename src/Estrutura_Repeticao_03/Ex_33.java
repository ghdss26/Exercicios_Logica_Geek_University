package Estrutura_Repeticao_03;

public class Ex_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i = 2, j = 3, n = 6, k = 0, l = 1; 
		
		while(l <= n) {
			
			if(k % i == 0 || k % j == 0) {
				
				System.out.printf(" %d ", k);
				l = l + 1;
			}
			
			k = k + 1;
		}
	}

}
