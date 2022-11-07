package Indrotucao_01;

import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dinheiro_dia = 30.00, pagamento; // por dia
		
		int dias_trabalhados, numero_dias;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dias trabalhados do encanador: "); 
		dias_trabalhados = sc.nextInt(); 
		
		numero_dias =  365 + dias_trabalhados;
		
		pagamento = (double) (numero_dias + (dinheiro_dia * 0.08));
		
		System.out.printf("Quantia Liquida de trabalho por dias: R$ %.2f ", pagamento);
		
	}

}
