package Funcoes_06;

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3, b = 3, c = 3; 
		
		formacao_triangulo(a, b, c);
		tipo_triangulo(a, b, c);
		
	}

	private static void formacao_triangulo(int a, int b, int c) {
		
		if(a + b > c && b + c > a && c + a > b) {
			
			System.out.println("Formam um tipo de triângulo");
			
		} else {
			
			System.out.println("Valores Não forma um triângulo ");
		}
		
	}
	
	private static void tipo_triangulo(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		if(a + b > c && b + c > a && c + a > b) {
			
			if(a == b || b == c) {
				
				System.out.println("Equilátero"); 
				
			} else if(a == b || b == c || c == a) {
				
				System.out.println("Isósceles");
				
			} else {
				
				System.out.println("Escaleno");
			}
			
		} 
	}

}
