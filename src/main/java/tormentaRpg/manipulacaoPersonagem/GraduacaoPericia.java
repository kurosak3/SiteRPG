package tormentaRpg.manipulacaoPersonagem;

import tormentaRpg.criacaoPersonagem.Pericia;
import tormentaRpg.criacaoPersonagem.Personagem;
import util.UltilValidar;


public class GraduacaoPericia {
	
	
	public static Integer calcularPericiaClasse(Personagem pnj, Pericia per) {
		int graduacao =0;
		int modAtribulto;
		int penalidade;
		int outros;
		int totalGraduacao;
				
		graduacao = pnj.getNivelPersonagem() +3;		
		modAtribulto = per.getModAtributo();
		outros = per.getModOutros();		
		penalidade = per.getPenalidade();
		UltilValidar.valInteiro(outros);
		UltilValidar.valInteiro(penalidade);
		if(penalidade>0) {
			totalGraduacao = graduacao+modAtribulto+outros-penalidade;
		}else{
			totalGraduacao = graduacao+modAtribulto+outros;	
		}		
		
		return totalGraduacao;
	}
	
	public static Integer calcularPericia(Personagem pnj, Pericia per) {
		int graduacao =0;
		int modAtribulto;
		int penalidade;
		int outros;
		int totalGraduacao;
				
		graduacao = pnj.getNivelPersonagem();
		if(graduacao %2!=0) {
			graduacao = (graduacao-1)/2;			
		}else {
			graduacao = graduacao/2;
		}
		modAtribulto = per.getModAtributo();
		outros = per.getModOutros();		
		penalidade = per.getPenalidade();
		UltilValidar.valInteiro(outros);
		UltilValidar.valInteiro(penalidade);
		if(penalidade>0) {
			totalGraduacao = graduacao+modAtribulto+outros-penalidade;
		}else{
			totalGraduacao = graduacao+modAtribulto+outros;	
		}		
		
		
		return totalGraduacao;
	}

}
