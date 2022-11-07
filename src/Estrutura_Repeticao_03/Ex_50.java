package Estrutura_Repeticao_03;

public class Ex_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double chico = 1.50, ze = 1.10, crescimento_chico = 0, crescimento_ze = 0; 
		
		int ano = 0;
		
		while(chico >= ze) {
			
			chico += 0.02;
			ze += 0.03;
			
			ano++;
		}
		
		System.out.printf("Ano: %d anos", ano);
	}

}
