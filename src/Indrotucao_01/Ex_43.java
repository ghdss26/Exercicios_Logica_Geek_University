package Indrotucao_01;

import java.util.Scanner;

public class Ex_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor, total, parcela, comissao_a_vista, comissao_parcelada; 
		double desconto = 0.10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		valor = sc.nextDouble();
		
		total = valor + (valor * desconto); 
		parcela = valor + (1 + total * 3);
		comissao_a_vista = (valor * 0.05) / desconto;
		comissao_parcelada = parcela - (valor * 0.05) / total;
		
		System.out.printf("Total a pagar: %.2f \n", total);
		System.out.printf("O Valor das parcelas: %.2f \n", parcela); 
		System.out.printf("A comissão a vista: %.2f \n", comissao_a_vista);
		System.out.printf("A comissão parcelada: %.2f \n", comissao_parcelada); 
		
	}

}
