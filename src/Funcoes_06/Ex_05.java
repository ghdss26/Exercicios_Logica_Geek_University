package Funcoes_06;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14; 
		double R = 9.34; 
		
		volume_esfera(R, pi);
	}

	private static double volume_esfera(double R, double pi) {
		
		double v ; 
		
		v = 4 / 3 * pi * Math.pow(R, 3);
		
		System.out.printf("Volume da Esfera: %.2f", v);
		
		return v;
		
	}

}
