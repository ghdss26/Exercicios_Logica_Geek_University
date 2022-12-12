package Funcoes_06;

public class Ex_61 {

	public static void main(String[] args) {
		
		String s1 = "ramo"; 
		String s2 = "roma"; 
		
		if(isAnagrama(s1, s2)) {
			
			System.out.println("é um Anagrama !");
			
		} else {
			
			System.out.println("Não é um Anagrama !");
		}
	}

	private static boolean isAnagrama(String s1, String s2) {
		
		int i, r = 0; 
		
		for(i = 0; i < s1.length(); i++) {
			
			r = r ^ s1.charAt(i);
		}
		
		for(i = 0; i < s2.length(); i++) {
			
			r = r ^ s2.charAt(i);
		}
		
		return (r == 0);
	}
}
