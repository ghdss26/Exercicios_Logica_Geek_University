package Vetores_04;

public class Ex_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double vet7[] = new double[100]; 
		
		double multiplo = 0;
		
		int i; 
		
		for(i = 0; i < vet7.length; i++) {
			
			while(multiplo % 7 == 0 || multiplo % 10 == 0) {
				
				multiplo++;
				
			}
			
			vet7[i] = multiplo; 
			
			multiplo++; 
		}
		
		for(i = 0; i < vet7.length; i++) {
			
			System.out.printf(" [%d] : [%.2f] \n", i, vet7[i]); 
		}
	}
}
