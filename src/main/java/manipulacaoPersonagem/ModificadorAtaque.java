package manipulacaoPersonagem;

import criacaoPersonagem.Arma;
import criacaoPersonagem.Personagem;
import util.UltilValidar;

public class ModificadorAtaque {
	
	public static Integer modificadorCorpoAcorpo(Personagem pnj) {
		int bba;
		int modForca;		
		int ataOutros=0;
		int modTamanho=0;		
		int corpoAcorpo=0;
		ataOutros = pnj.getOutrosAtaque();
		modForca = pnj.getModForca();
		modTamanho = pnj.getModTamanhaAtaque();
		bba = pnj.getCorpoAcorpo();	
		
		corpoAcorpo = (ataOutros+modForca+modTamanho+bba);	
		
		return corpoAcorpo;
	}
	
	public static Integer ataqueArma(Arma ar) {		
		Arma arma = null;
		UltilValidar.valArma(arma);		
		arma = ar;
		int ataqueArma;		
		ataqueArma = arma.getAtaqueArma();		
		return ataqueArma;
	}
	
		
	public static Integer ataque(Personagem pnj) {
		int atqFinal=0;	
		int corpoAcorpo = modificadorCorpoAcorpo(pnj);
		int ataqueArma;		
		ataqueArma = pnj.getArmas().get(0).getAtaqueArma();		
		atqFinal = (corpoAcorpo+ataqueArma);		
		return atqFinal;
	}

}
