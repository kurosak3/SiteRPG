package tormentaRpg.manipulacaoPersonagem;

import tormentaRpg.criacaoPersonagem.Armadura;
import tormentaRpg.criacaoPersonagem.Personagem;
import util.UltilValidar;

public class ModificadorDefesa {

	public static void maximoDestreza(Personagem p) {
		Armadura a = new Armadura();
		a = p.getArmadura();
			if (p.getDestreza() > a.getMaximoDestreza()) {
				p.setDestreza(a.getMaximoDestreza());
				ModificadorAtribulto.modificadorDestreza(p);
				

			}

		
	}

	public static Integer modificadorArmadura(Personagem pnj) {
		int ca = 10;
		int arm = 0;
		int defNivel;
		int modTamanho = UltilValidar.valInteiro(pnj.getModTamanhaDefesa());
		int defOutros = UltilValidar.valInteiro(pnj.getOutrosDefesa());
		int defOutros2 = UltilValidar.valInteiro(pnj.getOutrosDefesa2());
		int modAtributo;
		Armadura armadura = new Armadura();
		armadura = UltilValidar.valArmadura(Armadura.listaArmaduras().get(0));
		pnj.setArmadura(armadura);
		maximoDestreza(pnj);				
			arm = arm + armadura.getDefesaArmadura();		
		if (pnj.getNivelPersonagem() % 2 == 0) {
			defNivel = pnj.getNivelPersonagem() / 2;
		} else {
			defNivel = (pnj.getNivelPersonagem() - 1) / 2;
			if (defNivel < 1) {
				defNivel = 0;
			}
		}

		modAtributo = UltilValidar.valInteiro(ModificadorAtribulto.modificadorDestreza(pnj));

		ca = (ca + modAtributo + arm + defNivel + defOutros + defOutros2 + modTamanho);
		return ca;
	}
}
