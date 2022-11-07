package Estrutura_Condicional_02;

import java.util.Scanner;

public class Ex_35 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia, mes, ano, diamax = 0, anobi = 1, mexmax = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia: ");
		dia = sc.nextInt();
		
		System.out.println("Informe o mês: ");
		mes = sc.nextInt();
		
		System.out.println("Informe o ano: ");
		ano = sc.nextInt();
		
		anobi = conferirano(ano, anobi);
		System.out.printf("Ano Bissexto: %d\n", anobi); 
		
		diamax = conferirmes(mes, diamax, anobi); 
		System.out.printf("Dia Máximo: %d %d %d\n", mes, diamax, anobi); 
		
		dia = proximodia(dia, diamax, mes, mexmax , ano);
		System.out.printf("Dia Máximo: %d %d %d %d %d\n", dia, diamax, mes, mexmax, ano); 
	}
	
	public static int proximodia(int dia, int diamax, int mes, int mexmax, int ano) {
		
		if(dia < diamax) {
			
			dia = dia+1; 
			
		} else if(dia == diamax) {
			
			dia = 1; 
			mes = proximomes(mes, mexmax, ano);
			
		} else {
			
			System.out.println("O número digitado não é um dia suportável");
		}
		
		return dia;
		
	}

	public static int proximomes(int mes, int mexmax, int ano) {
		
		int mesmax = 12;
		
		mes = mes + 1; 
		
		if(mes >= mesmax) {
			
			mes = 1; 
			ano = proximoano(ano);
			
		}
		
		return mes;
	}
	
	public static int proximoano(int ano) {
		
		ano = ano + 1; 
		
		return ano;
	}
	
	public static int conferirano(int ano, int anobi) {
		
		if(ano % 400 == 0) {
			
			anobi = 1;
			
		} else {
			
			if(ano % 100 == 0) {
				
				anobi = 0; 
				
			} else {
				
				if (ano % 4 == 0) {
					
					anobi = 1;
					
				} else {
					
					anobi = 0;
				}
			}
		}
		
		return anobi;
	}
	
	public static int conferirmes(int mes, int diamax, int anobi) {
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11) {
			
			diamax = 31;
			
		} else if (mes == 2) {
			
			if(anobi == 0) {
				
				diamax = 28; 
				
			} else {
				
				diamax = 29;
			}
			
		} else {
			
			diamax = 30;
		}
		
		return diamax;
	}
}
