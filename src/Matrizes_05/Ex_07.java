package Matrizes_05;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[][] = new int[10][10]; 
		
		int i, j = 0; 
		
		System.out.println("Elemento 1: ");
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				if(i < j) {
					
					A[i][j] = 2 * i + 7 * j - 2;
					
					System.out.printf("Elemento : [%d][%d] =  %d \n", i, j, A[i][j]);
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Elemento 2: ");
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				if(i == j) {
					
					A[i][j] = (int) (Math.pow(3 * i, 2) - 1);
					System.out.printf("Elemento : [%d][%d] =  %d \n", i, j, A[i][j]);
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Elemento 3: ");
		
		for(i = 0; i < A.length; i++) {
			
			for(j = 0; j < A.length; j++) {
				
				if(i > j) {
					
					A[i][j] = (int) (Math.pow(4 * i, 3) - Math.pow(5 * j, 2) + 1);
					System.out.printf("Elemento : [%d][%d] =  %d \n", i, j, A[i][j]);
				}
			}
		}
	}
}
