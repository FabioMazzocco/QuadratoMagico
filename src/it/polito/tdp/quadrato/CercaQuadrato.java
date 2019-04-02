package it.polito.tdp.quadrato;

import java.util.List;

public class CercaQuadrato {
	List<Quadrato> soluzioni;
	private void cerca(Quadrato parziale, int L) {
		
		if( L == parziale.getSize()*parziale.getSize()) {
			//QUADRATO PIENO
			//è  un quadrato magico? Se si, lo salvo
			if(parziale.isMagic()) {
				soluzioni.add(parziale.clone());
			}
			return;
		}
		
		for(int i=0; i<=parziale.getSize()*parziale.getSize(); i++) {
			
			if(!parziale.contains(i)) {
				parziale.add(i);
				
				cerca(parziale, L+1);
				
				parziale.remove(i);
			}
		}
		
	}
	
	public void stampaSoluzioni() {
		for(Quadrato q : soluzioni)
			q.toString();
	}
	
}
