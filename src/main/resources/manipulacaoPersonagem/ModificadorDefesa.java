package manipulacaoPersonagem;

import java.util.ArrayList;
import java.util.List;

import criacaoPersonagem.Armadura;
import criacaoPersonagem.Personagem;

public class ModificadorDefesa {

	
	public static Integer modificadorArmadura(Personagem pnj) {
		int ca=10;
		int arm=0;
		Armadura armadura; 
		Armadura armaduraEquipada; 
		List<Armadura> equipadas = new ArrayList<>();
		equipadas = Armadura.listaArmaduras();
		for(int a=0;a<pnj.getArmaduras().size();a++) {
			for(int i=0;i<equipadas.size();i++) {
				armadura = new Armadura();
				armaduraEquipada = new Armadura();
				armaduraEquipada =  pnj.getArmaduras().get(i);
				armadura = equipadas.get(a);				
				if(armaduraEquipada.getIdArmadura()==armadura.getIdArmadura()) {
					arm = arm+armadura.getDefesaArmadura();
					
					continue;				
				}					
			}
		}		
		ca = (ModificadorAtribulto.modificadorDestreza(pnj)+arm+(pnj.getNivelPersonagem()/2));		
		return ca;
	}
}
