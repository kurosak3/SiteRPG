package util;

import java.util.ArrayList;
import java.util.List;

import tormentaRpg.criacaoPersonagem.Arma;
import tormentaRpg.criacaoPersonagem.Armadura;
import tormentaRpg.criacaoPersonagem.Classe;
import tormentaRpg.criacaoPersonagem.Pericia;
import tormentaRpg.criacaoPersonagem.Talento;

public class UltilValidar {

	public static Integer valInteiro(Integer i) {
		if (i == null) {
			i = 0;
		}
		return i;
	}

	public static String valString(String s) {
		if (s == null) {
			s = "";
		}
		return s;
	}

	public static Long valLong(Long l) {
		if (l == null) {
			l = 0l;
		}
		return l;
	}

	public static Double valDouble(Double d) {
		if (d == null) {
			d = 0.;
		}
		return d;
	}

	public static Float valDouble(Float f) {
		if (f == null) {
			f = 0f;
		}
		return f;
	}

	public static List<String> valList(List<String> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}

	public static List<Integer> valListInteiro(List<Integer> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}	

	public static List<Classe> valHabilidadesDeClasse(List<Classe> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}

	public static List<Talento> valTalentos(List<Talento> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}
	
	public static Talento valTalento(Talento lst) {
		if (lst == null) {
			lst = new Talento();	
		}
		return lst;
	}

	public static List<Pericia> valPericias(List<Pericia> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}

	public static List<Arma> valArmas(List<Arma> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}
	
	public static List<Classe> valClasses(List<Classe> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}
	public static Classe valClasses(Classe lst) {
		if (lst == null) {
			lst = new Classe();
			
		}
		return lst;
	}
	
	public static Arma valArma(Arma arma) {
		if (arma == null) {
			arma = new Arma();			
		}
		return arma;
	}

	public static List<Armadura> valArmaduras(List<Armadura> lst) {
		if (lst == null) {
			lst = new ArrayList<>();
			lst.isEmpty();
		}
		return lst;
	}
	
	public static Armadura valArmadura(Armadura armadura) {
		if (armadura == null) {
			armadura = new Armadura();			
		}
		return armadura;
	}

}
