package Vetores_04;

public class Ex_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trianguloPascal(7);
	}

	private static void trianguloPascal(int x) {
		// TODO Auto-generated method stub
		
		int [] n = new int[100]; 
		
		n[0] = 1;
		
		for(int i = 0; i < x; i++) {
			
			int est1 = 0, est2;
			
			for(int j = 0; j <= i; j++) {
				
				est2 = est1 + n[j];
				est1 = n[j]; 
				n[j] = est2;
				
				System.out.printf(" %2d ", n[j]);
			}
			
			System.out.println("");
		}
		
	}

}
