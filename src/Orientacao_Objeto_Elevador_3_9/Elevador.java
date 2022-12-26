package Orientacao_Objeto_Elevador_3_9;

import java.util.Scanner;

public class Elevador {

	private int andar_atual = 0;
	private int total_andares = 0;
	private int cap_elevador = 0; 
	private int quant_p = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public int getAndar_atual() {
		
		return andar_atual;
	}
	
	public void setAndar_atual(int andar_atual) {
		
		this.andar_atual = andar_atual;
	}
	
	public int getTotal_andares() {
		
		return total_andares;
	}
	
	public void setTotal_andares(int total_andares) {
		
		this.total_andares = total_andares;
	}
	
	public int getCap_elevador() {
		
		return cap_elevador;
	}
	
	public void setCap_elevador(int cap_elevador) {
		
		this.cap_elevador = cap_elevador;
	}
	
	public int getQuant_p() {
		
		return quant_p;
	}
	
	public void setQuant_p(int quant_p) {
		
		this.quant_p = quant_p;
	} 
	
	void inicializa(int cap_elevador, int total_andares) {
		
		this.cap_elevador = cap_elevador; 
		this.total_andares = total_andares;
	}
	
	void entra(int pessoa_entrou) {
		
	}
	
	void sai(int elevador_sobe) {
		
	}
	
	void desce(int elevador_desce) {
		
	}
	
	void Elevador_entra(int novo_passageiro) {
		
		int totalPessoas = getQuant_p();
		int capacidade = getCap_elevador();
		
		if(totalPessoas <= capacidade) {
			
			this.quant_p = this.quant_p + novo_passageiro; 
			
		} else {
			
			System.out.println("O Elevador esta lotado, favor esperar o próximo");
		}
	}
	
	void Elevador_sai(int pessoas_saiu) {
		
		int totalPessoas = getQuant_p();
		
		if (totalPessoas <= 0) {
			
			System.out.println("Não existe passageiro no elevador"); 
			
		} else {
			
			this.quant_p = this.quant_p - pessoas_saiu;
		}
	}
	
	void Elevador_sobe(int up) {
		
		int andar = getAndar_atual(); 
		int totalAndares = getTotal_andares(); 
		
		if(andar == totalAndares) {
			
			System.out.println("O elevador está no último andar, aperte para descer!");
			
		} else {
			
			this.andar_atual = this.andar_atual + up;
		}
	}
	
	void Elevador_desce(int down) {
		
		int andar = getAndar_atual();
		
		if(andar == 0) {
			
			System.out.println("O elevador está no térreo, aperte para subir");
			
		} else {
			
			this.andar_atual = this.andar_atual - down;
		}
	}
	
	void executa() {
		
		int opcao = 0;
		
		do {
			
			System.out.println("1 - Inserir Passageiro no elevador");
			System.out.println("2 - Retirar Passageiro do elevador");
			System.out.println("3 - Subir");
			System.out.println("4 - Descer");
			System.out.println("5 - Exibir andar atual");
			System.out.println("6 - Exibir passageiros remanescentes"); 
			System.out.println("7 - Sair do programa"); 
			
			System.out.println("Informe uma opção: "); 
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1: 
				
				System.out.println("Um passageiro embarcou !");
				Elevador_entra(1);
				break;
				
			case 2: 
				
				System.out.println("Um passageiro desembarcou !");
				Elevador_sai(1);
				break;
				
			case 3: 
				
				System.out.println("O elevador esta subindo !"); 
				Elevador_sobe(1); 
				break;
				
			case 4: 
				
				System.out.println("O elevador está descendo !"); 
				Elevador_desce(1);
				
			case 5: 
				
				System.out.println("Andar atual"); 
				System.out.println(getAndar_atual());
				break; 
				
			case 6: 
				
				System.out.println("Passageiros remanescentes"); 
				System.out.println(getQuant_p());
				break;
				
			case 7: 
				
				System.out.println("Saindo do programa");
				break;
			}
			
		} while(opcao <= 8);
	}
	
}
