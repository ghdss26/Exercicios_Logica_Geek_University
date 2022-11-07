/*
 * 
 * Faça um programa que determine e mostre os cincos primeiros multíplos de 3, 
 * considerando números maiores que 0
 * 
 */

package Estrutura_Repeticao_03;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 0; 
		int i = 1; 
		
		while(i > 0) {
			
			if(i % 3 == 0) {
				
				System.out.println("Multiplos de 3: " + i);
				m++;
			}
			
			if(m == 5) {
				
				break;
			}
			
			i++;
		}
	}
}
