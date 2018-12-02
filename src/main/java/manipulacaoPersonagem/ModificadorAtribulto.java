package manipulacaoPersonagem;

import criacaoPersonagem.Personagem;
import util.UltilValidar;

public class ModificadorAtribulto {
	
	public static Integer modificadorNivel(Personagem pnj) {
		int bonusNivel = 0;
		int nivel = pnj.getNivelPersonagem();
		if (nivel % 2 != 0) {
			nivel = nivel - 1;
		}
		bonusNivel = (nivel/2);

		return bonusNivel;
	}

	public static Integer modificadorForca(Personagem pnj) {
		int modForca = 0;
		int atributo = pnj.getForca();
		if (atributo % 2 != 0) {
			atributo = atributo - 1;
		}
		pnj.setModForca(modForca = (atributo - 10) / 2);

		return modForca;
	}

	public static Integer modificadorDestreza(Personagem pnj) {
		int modDestreza = 0;
		int atributo = pnj.getDestreza();
		if (atributo % 2 != 0) {
			atributo = atributo - 1;
		}

		pnj.setModDestreza(modDestreza = (atributo - 10) / 2);

		return modDestreza;
	}

	public static Integer modificadorConstituicao(Personagem pnj) {
		int modConstituicao = 0;
		int atributo = UltilValidar.valInteiro(pnj.getConstituicao());
		if (atributo == 0)
			pnj.setConstituicao(atributo);
			pnj.setModConstituicao(modConstituicao = 0);
		if (atributo % 2 != 0) {
			atributo = atributo - 1;
		}
		if(atributo!=0) {
		pnj.setModConstituicao(modConstituicao = (atributo - 10) / 2);			
		}
		
		return modConstituicao;
	}

	public static Integer modificadorInteligencia(Personagem pnj) {
		int modInteligencia = 0;
		int atributo = pnj.getInteligencia();
		if (atributo % 2 != 0) {
			atributo = atributo - 1;
		}

		pnj.setModInteligencia(modInteligencia = (atributo - 10) / 2);

		return modInteligencia;
	}

	public static Integer modificadorSabedoria(Personagem pnj) {
		int modSabedoria = 0;
		int atributo = pnj.getSabedoria();
		if (atributo % 2 != 0) {
			atributo = atributo - 1;
		}

		pnj.setModSabedoria(modSabedoria = (atributo - 10) / 2);

		return modSabedoria;
	}

	public static Integer modificadorCarisma(Personagem pnj) {
		int modCarisma = 0;
		int atributo = pnj.getCarisma();
		if (atributo % 2 != 0) {
			atributo = atributo - 1;
		}

		pnj.setModCarisma(modCarisma = (atributo - 10) / 2);

		return modCarisma;
	}

	public static void calcularModificadores(Personagem personagem) {
		System.out.println(modificadorForca(personagem));
		System.out.println(modificadorDestreza(personagem));
		System.out.println(modificadorConstituicao(personagem));
		System.out.println(modificadorInteligencia(personagem));
		System.out.println(modificadorSabedoria(personagem));
		System.out.println(modificadorCarisma(personagem));

	}

}
