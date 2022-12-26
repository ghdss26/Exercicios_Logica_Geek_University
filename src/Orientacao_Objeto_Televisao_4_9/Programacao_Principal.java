package Orientacao_Objeto_Televisao_4_9;

public class Programacao_Principal {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto(); 
		
		controle.addCanal();
		controle.addCanal();
		controle.addCanal();
		
		controle.addVolume();
		controle.addVolume();
		controle.addVolume();
		
		controle.setCanal(400);
		controle.addCanal();
		controle.addCanal();
	}

}
