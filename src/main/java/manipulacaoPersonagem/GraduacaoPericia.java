package manipulacaoPersonagem;

import java.util.ArrayList;
import java.util.List;

import criacaoPersonagem.Pericia;
import criacaoPersonagem.Personagem;

public class GraduacaoPericia {
	
	
	public static Integer calcularPericia(Personagem pnj) {
		int graduação =0;
		Pericia pericia;
		Pericia periciaClasse;
		List<Pericia> pericias= new ArrayList<>();
		for(int a=0;a<pnj.getPericias().size();a++) {
			for(int i=0;i<pericias.size();i++) {
				pericia = new Pericia();
				periciaClasse = new Pericia();
				periciaClasse =  pnj.getPericias().get(i);
				pericia = pericias.get(a);				
				if(periciaClasse.getIdPericia()==pericia.getIdPericia()) {
										
					continue;				
				}					
			}
		}
		
		return graduação;
	}

}
