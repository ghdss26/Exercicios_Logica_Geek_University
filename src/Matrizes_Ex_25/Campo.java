package Matrizes_Ex_25;

public class Campo {

	private String [][] mat = {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}}; 
	
	int l, c;
	
	public String Visualizar() {
		
		for(l = 0; l < mat.length; l++) {
			
			for(c = 0; c < mat.length; c++) {
				
				System.out.printf("  " + mat[l][c]);
			}
			
			System.out.println("\n");
		}
		
		return null;
	}
	
	public boolean Verificado(String pos) {
		
		for(l = 0; l < mat.length; l++) {
			
			for(c = 0; c < mat.length; c++) {
				
				if(mat[l][c].equals(pos)) {
					
					return true;
				}
			}
			
		}
		
		return false;
	}
	
	public void Escolher(String pos, String jog) {
		
		if(pos.equals("1")) {
			
			mat[0][0] = jog;
			
		} else if(pos.equals("2")) {
			
			mat[0][1] = jog;
			
		} else if(pos.equals("3")) {
			
			mat[0][2] = jog; 
			
		} else if(pos.equals("4")) {
			
			mat[1][0] = jog; 
			 
		} else if(pos.equals("5")) {
			
			mat[1][1] = jog; 
			
		} else if(pos.equals("6")) {
			
			mat[1][2] = jog;
			
		} else if(pos.equals("7")) {
			
			mat[2][0] = jog; 
			
		} else if(pos.equals("8")) {
			
			mat[2][1] = jog;
			
		} else if(pos.equals("9")) {
			
			mat[2][2] = jog;
		}
	}
	
	public String Vencendor(int escolhas) {
		
		String[] E = new String[8]; 
		String vencedor = "null";
		
		if(escolhas == 9) {
			
			vencedor = "Empate";
		}
		
		// Horizontais 
		E[0] = mat[0][0] + mat[0][1] + mat[0][2];
		E[1] = mat[1][0] + mat[1][1] + mat[1][2];
		E[2] = mat[2][0] + mat[2][1] + mat[2][2];
		
		// Verticais
		E[3] = mat[0][0] + mat[1][0] + mat[2][0];
		E[4] = mat[0][1] + mat[1][1] + mat[2][1];
		E[5] = mat[0][2] + mat[2][2] + mat[2][2];
		
		// Diagonal Principal 
		E[6] = mat[0][0] + mat[1][1] + mat[2][2];
		
		// Diagonal Secundária 
		E[7] = mat[0][2] + mat[1][1] + mat[2][0];
		
		for(l = 0; l < E.length; l++) {
			
			if(E[l].equals("XXX")) {
				
				vencedor = "Jogador 1";
				
			} else if(E[l].equals("000")) {
				
				vencedor = "Jogador 2"; 
			}
		}
		
		return vencedor;
	}
}
