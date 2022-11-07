package Estrutura_Repeticao_03;

public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int u = 3;
		int d = 2;
		int a = 1;
		
		for(int i = 100; i < 999; i++) {
			
			a = i % 1000; 
			a = (a - d) - u; 
			a = a / 100;
			
			System.out.println(a);
		}
	}

}
