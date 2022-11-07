package Vetores_04;

import java.util.Arrays;

public class Ex_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {9,2,5,6,5}; 
		int y[] = {6,12,2,9,12}; 
 		
		int soma = 0, produto = 0;
		int vet[] = intersecao(x,y);
		int vet1[] = uniao(x, y);
		
		int diferenca = diferenca(x, y);
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < y.length; j++) {
				
				soma = x[i] + y[j];
				produto = produto + x[i] * y[j];
 			}
		}
		
		System.out.printf("Soma de x e y é: %d \n", soma);
		System.out.printf("Produto escalar de x e y é: %d \n", produto);
		System.out.println("Interseção: " + Arrays.toString(vet));
		System.out.println("União: " + Arrays.toString(vet1));
		
	}

	private static int diferenca(int[] x, int[] y) {
		// TODO Auto-generated method stub
		
		int diferenca = 0, cont = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < y.length; j++) {
				
				diferenca = y[j] - x[i];
			}
		}
		
		System.out.printf("Diferença entre x e y:  %d \n", diferenca); 
		
		return diferenca;
	}

	private static int[] intersecao(int[] x, int[] y) {
		
		// TODO Auto-generated method stub
		
		int ass[] = new int[x.length + y.length]; 
		
		int cont = 0; 
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < y.length; j++) {
				
				if(x[i] == y[j]) {
					
					ass[cont++] = x[i]; 
				}
			}
		}
		
		int vet[] = new int[cont];
		
		for(int i = 0; i < cont; i++) {
			
			vet[i] = ass[i]; 
		}
		
		return vet;
	}
	
	private static int[] uniao(int[] x, int[] y) {
		// TODO Auto-generated method stub
		
		int vet1[] = new int[x.length + y.length];
		int cont = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			vet1[cont++] = x[i];
			
		}
		
		for(int i = 0; i < y.length; i++) {
			
			if(!existe(x[i], vet1, cont)) {
				
				vet1[cont++] = x[i];
			}
		}
		
		vet1 = Arrays.copyOf(vet1, cont);
		
		return vet1;
	}

	private static boolean existe(int i, int[] vet1, int cont) {
		// TODO Auto-generated method stub
		
		for(int i1 = 0; i1 < cont; i1++) {
			
			if(vet1[i1] == i) {
				
				return true;
			}
		}
		
		return false;
	}

}
