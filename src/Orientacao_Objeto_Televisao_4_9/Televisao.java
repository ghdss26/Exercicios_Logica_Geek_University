package Orientacao_Objeto_Televisao_4_9;

import java.io.Serializable;

public class Televisao implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	private int canal;
	private int volume;
	
	public Televisao() {
		
		this(0,0);
	}

	public Televisao(int canal, int volume) {
		
		setCanal(canal); 
		setVolume(volume);
	}
	
	public void addCanal() {
		
		setCanal(getCanal() + 1);
	}
	
	public void addVolume() {
		
		setVolume(getVolume() + 1);
	}
	
	public int getCanal() {
		// TODO Auto-generated method stub
		return this.canal;
	}
	
	public int getVolume() {
		
		return this.volume;
	}
	
	void setCanal(int canal) {
		
		if((canal < 1) || (canal > 500)) {
			
			canal = 1;
		}
		
		for(int i = canal; i <= 500; i++) {
			
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				
				this.canal = i; 
				
				break;
			}
		}
		
		System.out.println("Canal: " + getCanal());
	}

	private void setVolume(int volume) {
		
		if((volume >= 0) && (volume <= 50)) {
			
			this.volume = volume;
		}
		
		System.out.println("Volume: " + getVolume());
	}

	public void subCanal() {
		
		setCanal(getCanal() - 1);
	}
	
	public void subVolume() {
		
		setVolume(getVolume() - 1);
	}

}
