package Matrizes_05;

public class Ex_24 {
	
	static int L = 3; 
	static int C = 4; 
	
	static int Produto_Maximo(int m[][]) {
		
		int maximo = Integer.MAX_VALUE; 
		
		int i, j, produto; 
		
		for(i = 1; i < L - 1; i++) {
			
			for(j = 1; j < C - 1; j++) {
				
				produto = m[i + 1][j] * m[i - 1][j] * m[i][j + 1] * m[i][j - 1]; 
				
				if(produto > maximo) {
					
					maximo = produto; 
				}
			}
		}
		
		return maximo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = {{26, 63, 78, 14}, {20, 97, 45, 3}, {99, 44, 15, 58}}; 
		
		System.out.println(Produto_Maximo(m));
	}

}
