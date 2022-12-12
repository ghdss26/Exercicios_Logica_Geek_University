package Funcoes_06;

import java.util.Arrays;

public class Ex_60 {

	public static void main(String[] args) {
		
		String str1 = "Gustavo, Henrique";
		
		System.out.println(posicao(str1));

	}

	private static int posicao(String str1) {
		// TODO Auto-generated method stub
		
		String substrings[] = str1.split(",", 0);
		
		for(int i = 0; i < substrings.length; i++) {
			
			if(substrings[i].equals(str1)) {
				
				System.out.println(Arrays.toString(substrings));
			} 
		}
		
		return -1;
	}
}
