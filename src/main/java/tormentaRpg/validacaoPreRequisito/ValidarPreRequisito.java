package tormentaRpg.validacaoPreRequisito;

import java.util.ArrayList;
import java.util.List;

import tormentaRpg.criacaoPersonagem.Armadura;
import tormentaRpg.criacaoPersonagem.Classe;
import tormentaRpg.criacaoPersonagem.Personagem;
import tormentaRpg.criacaoPersonagem.Talento;
import tormentaRpg.manipulacaoPersonagem.ModificadorAtribulto;
import tormentaRpg.manipulacaoPersonagem.ModificadorDefesa;
import tormentaRpg.preRequisito.PreRequisitoPericia;
import tormentaRpg.preRequisito.PreRequisitoTalentos;
import util.UltilValidar;

public class ValidarPreRequisito {

	public static Boolean validarClasse(Personagem p, Talento t) {
		Boolean validar = false;
		String classe = "";
		String classe2 = "";		
		int i2;
		List<Classe> classes = UltilValidar.valClasses(p.getClasses());		
		List<String> requisitos2 = new ArrayList<>();
		if (!(classes.isEmpty()))
			for (i2 = 0; i2 < p.getClasses().size(); i2++) {
				classe = p.getClasses().get(i2).getNomeClasse();
				requisitos2.add(classe);
			}
		else {
			requisitos2.isEmpty();
		}
		classe2 = t.getPreRequisitosTalento().getClasse();
		if (classe.equals(classe2)) {
			validar = true;
		} else {
			validar = false;
		}

		return validar;
	}

	public static Boolean validarTalento(Talento t, Personagem p) {
		String tal = "";
		String tal2 = null;
		Boolean validar = false;
		List<String> requisitos = new ArrayList<>();
		List<String> requisitos2 = new ArrayList<>();
		List<Talento> talentos;
		int i;
		int i2;
		if (!(t.getPreRequisitosTalento().getTalentos().isEmpty()))
			for (i2 = 0; i2 < t.getPreRequisitosTalento().getTalentos().size(); i2++) {
				tal2 = t.getPreRequisitosTalento().getTalentos().get(i2).getNomeTalento();
				requisitos2.add(tal2);
			}
		else {
			requisitos2.isEmpty();
		}
		talentos = UltilValidar.valTalentos(p.getTalentos());
		for (i = 0; i < talentos.size(); i++) {
			tal = p.getTalentos().get(i).getNomeTalento();
			requisitos.add(tal);
		}
		if (!(requisitos2.isEmpty())) {
			if (requisitos.containsAll(requisitos2)) {
				validar = true;
			} else {
				validar = false;
			}
		} else {
			validar = true;
		}
		return validar;

	}

	public static Boolean validarPreRequisito(Talento t, Personagem p) {
		Personagem requisito = new Personagem();
		PreRequisitoTalentos requisito2 = new PreRequisitoTalentos();
		requisito = p;
		requisito2 = t.getPreRequisitosTalento();
		if ((requisito2.getClasse().equals(null) || requisito2.getClasse().equalsIgnoreCase("") || validarClasse(p,t))
				&& (requisito.getNivelPersonagem() >= requisito2.getNivelPersonagem())
				&& (requisito.getForca() >= requisito2.getForca())
				&& (requisito.getDestreza() >= requisito2.getDestreza())
				&& (requisito.getConstituicao() >= requisito2.getConstituicao())
				&& (requisito.getInteligencia() >= requisito2.getInteligencia())
				&& (requisito.getSabedoria() >= requisito2.getSabedoria())
				&& (requisito.getCarisma() >= requisito2.getCarisma())
				&& (UltilValidar.valInteiro(requisito.getCorpoAcorpo()) >= UltilValidar.valInteiro(requisito2.getCorpoAcorpo())) && validarTalento(t, p)) {
			return true;

		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		List<Talento> tal = new ArrayList<>();
		Classe classe;
		tal.isEmpty();
		PreRequisitoTalentos pr = new PreRequisitoTalentos(50, 4, "as", 13, 13, 0, 0, 0, 0, 0, tal);
		PreRequisitoPericia pp = new PreRequisitoPericia();
		List<Talento> talentos = new ArrayList<>();
		talentos.add(new Talento(01, "a", pr, pp, "nada"));
		talentos.add(new Talento(02, "b", pr, pp, "nada"));
		talentos.add(new Talento(90, "c", pr, pp, "nada"));
		talentos.add(new Talento(04, "d", pr, pp, "nada"));
		talentos.add(new Talento(05, "f", pr, pp, "nada"));

		List<Talento> talentos2 = new ArrayList<>();
		talentos2.add(new Talento(01, "b", pr, pp, "nada"));
		talentos2.add(new Talento(02, "a", pr, pp, "nada"));
		talentos2.add(new Talento(03, "c", pr, pp, "nada"));
		talentos2.add(new Talento(60, "f", pr, pp, "nada"));

		PreRequisitoTalentos pr2 = new PreRequisitoTalentos(50, 4, "as", 13, 13, 0, 0, 0, 0, 0, talentos2);
		Talento t = new Talento(01, "a", pr, pp, "nada");
		Talento t2 = new Talento(01, "e", pr2, pp, "nada");
		classe = new Classe(10l, "as", "", 1, 1);
		List<Classe> classes = new ArrayList<>();
		classes.add(classe);

		Personagem p = new Personagem();
		p.setDestreza(30);
		p.setForca(18);
		p.setCarisma(15);
		p.setClasse(classes);
		p.setConstituicao(0);
		p.setInteligencia(8);
		p.setSabedoria(12);
		p.setNivelPersonagem(10);
		p.setArmadura(Armadura.listaArmaduras().get(0));

		System.out.println(ModificadorAtribulto.modificadorConstituicao(p));
		System.out.println(validarPreRequisito(t, p));
		System.out.println(validarPreRequisito(t2, p));

		System.out.println(ModificadorDefesa.modificadorArmadura(p));
	}

}
