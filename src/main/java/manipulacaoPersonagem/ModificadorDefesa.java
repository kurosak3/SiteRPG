package manipulacaoPersonagem;

import java.util.ArrayList;
import java.util.List;

import criacaoPersonagem.Armadura;
import criacaoPersonagem.Personagem;

public class ModificadorDefesa {

	
	public static Integer modificadorArmadura(Personagem pnj) {
		int ca=10;
		int arm=0;
		int defNivel;
		int defOutros=0;
		int defOutros2=0;
		if(pnj.getOutrosDefesa()!=null) {
			defOutros = pnj.getOutrosDefesa();
		}
		if(pnj.getOutrosDefesa2()!=null) {
			defOutros2 = pnj.getOutrosDefesa2();
		}
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
		if(pnj.getNivelPersonagem() %2==0) {
			defNivel = pnj.getNivelPersonagem()/2;
		}else {
			defNivel = (pnj.getNivelPersonagem()-1)/2;
			if(defNivel<1) {
				defNivel=0;				
			}
		}
			
		ca = (ModificadorAtribulto.modificadorDestreza(pnj)+arm+defNivel+defOutros+defOutros2);		
		return ca;
	}
}
