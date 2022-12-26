package Orientacao_Objeto_Televisao_4_9;

import java.io.Serializable;

public class ControleRemoto implements Serializable{

	private static final long serialVersionUID = 1L; 
	
	private Televisao televisao;
	
	public ControleRemoto() {
		
		this.televisao = new Televisao(); 
		
	}
	
	public void addCanal() {
		
		this.televisao.addCanal();
	}
	
	public void addVolume() {
		
		this.televisao.addVolume();
	}
	
	public int getCanal() {
		
		return this.televisao.getCanal();
	}
	
	public int getVolume() {
		
		return this.televisao.getVolume();
	}
	
	public void setCanal(int canal) {
		
		this.televisao.setCanal(canal);
	}
	
	public void subCanal() {
		
		this.televisao.subCanal();
	}
	
	public void subVolume() {
		
		this.televisao.subVolume();
	}
}
