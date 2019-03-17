package tormentaRpg.manipulacaoPersonagem;

import tormentaRpg.criacaoPersonagem.Personagem;

public class ModificadorResistencia {
	
	public static Integer ResitenciFortitude(Personagem pnj) {
		int fortitude=0;
		int modAtributo=0;		
		int Outros=0;				
		int nivel=0;
		nivel = ModificadorAtribulto.modificadorNivel(pnj);
		Outros = pnj.getOutrosFortitude();
		modAtributo = pnj.getModConstituicao();
		
		fortitude = (Outros+modAtributo+nivel);	
		
		return fortitude;
	}
	
	public static Integer ResitenciReflexo(Personagem pnj) {
		int reflexo=0;
		int modAtributo=0;		
		int Outros=0;				
		int nivel=0;
		nivel = ModificadorAtribulto.modificadorNivel(pnj);
		Outros = pnj.getOutrosReflexo();
		modAtributo = pnj.getModDestreza();		
		
		reflexo = (Outros+modAtributo+nivel);	
		
		return reflexo;
	}
	
	public static Integer ResitenciVontade(Personagem pnj) {
		int vontade=0;
		int modAtributo=0;		
		int Outros=0;				
		int nivel=0;
		nivel = ModificadorAtribulto.modificadorNivel(pnj);
		Outros = pnj.getOutrosVontade();
		modAtributo = pnj.getModSabedoria();		
		
		vontade = (Outros+modAtributo+nivel);	
		
		return vontade;
	}

}
