package Orientacao_Objeto_Agenda_2_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	
	private String nome; 
	private int idade; 
	private double altura; 
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Agenda> agendas = new ArrayList<>();
	
	int i;
	
	boolean encontrado;

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public int getIdade() {
		
		return idade;
	}

	public void setIdade(int idade) {
		
		this.idade = idade;
	}

	public double getAltura() {
		
		return altura;
	}

	public void setAltura(double altura) {
		
		this.altura = altura;
	} 
	
	void armazenaPessoa(String nome, int idade, double altura) {
		
		System.out.println("Informe o nome da pessoa: "); 
		nome = sc.next(); 
		
		System.out.println("Informe a idade da pessoa: "); 
		idade = sc.nextInt(); 
		
		System.out.println("Informe a altura da pessoa: "); 
		altura = sc.nextDouble(); 
		
		Agenda a = new Agenda(); 
		
		a.setNome(nome);
		a.setIdade(idade);
		a.setAltura(altura); 
		
		agendas.add(a); 
		
		System.out.println("Pessoa adicionado na Agenda com sucesso: " + a.getNome()); 
	}
	
	void removerPessoa(String nome) {
			
		for(i = 0; i < agendas.size(); i++) {
			
			Agenda a = agendas.get(i); 
	
			System.out.println(" [ " + i + "]" + a.getNome());
		}
		
		System.out.println("Deseja Remover qual pessoa: "); 
		i = sc.nextInt(); 
		
		agendas.remove(i);
		
		System.out.println("Pessoa Removida com sucesso: " + i); 
	}
	
	void buscarPessoa(String nome) {
		
		System.out.println("Informe um nome que você deseja procurar: "); 
		nome = sc.next(); 
		
		for(i = 0; i < agendas.size(); i++) {
			
			Agenda a = agendas.get(i); 
			
			if(nome.equals(a.getNome())) {
				
				System.out.println("Nome: " + a.getNome()); 
				System.out.println("Idade: " + a.getIdade()); 
				System.out.println("Altura: " + a.getAltura());
				
				encontrado = true;
				break;
			}
		}
		
		if(!encontrado) {
			
			System.out.println("Não foi possível encontrar o nome.");
		}
		
		
	}
	
	void imprimirAgenda() {
		
		for(i = 0; i < agendas.size(); i++) {
			
			Agenda a = agendas.get(i);
			
			System.out.println("Nome: " + a.getNome()); 
			System.out.println("Idade: " + a.getIdade()); 
			System.out.println("Altura: " + a.getAltura());
		}
	}
	
	void imprimirPessoa(int i) {
		
		for(i = 0; i < agendas.size(); i++) {
			
			Agenda a = agendas.get(i);
			
			System.out.println("[" + i + "]" + a.getNome());
		}
	}
	
	void executar() {
		
		int opcao;
		
		do {
			
			System.out.println("1 - Armazenar Pessoa");
			System.out.println("2 - Remover Pessoa");
			System.out.println("3 - Buscar Pessoa");
			System.out.println("4 - Imprimir Agenda");
			System.out.println("5 - Imprimir Pessoa por Posição");
			
			System.out.println("");
			
			System.out.println("Informe uma opção: ");
			opcao = sc.nextInt(); 
			
			switch(opcao) {
			
			case 1: 
				
				armazenaPessoa(nome, idade, altura);
				break;
				
			case 2: 
				
				removerPessoa(nome);
				break;
				
			case 3: 
				
				buscarPessoa(nome);
				break;
				
			case 4: 
				
				imprimirAgenda();
				break;
				
			case 5: 
				
				imprimirPessoa(i);
				break;
			}
			
		} while(opcao <= 6);
	}
}
