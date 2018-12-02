package criacaoPersonagem;

import preRequisito.PreRequisitoPericia;
import preRequisito.PreRequisitoTalentos;


public class Talento {
	
	private Integer idTalento;	
	private String nomeTalento;
	private PreRequisitoTalentos preRequisitosTalento;
	private PreRequisitoPericia preRequisitoPericia;
	private String descricao;	
	private Personagem personagem;
	private Classe classe;
	
	
	public Talento() {
		
	}
	
	
	public Talento(Integer idTalento, String nomeTalento, PreRequisitoTalentos preRequisitosTalento,
			PreRequisitoPericia preRequisitoPericia, String descricao) {
		super();
		this.idTalento = idTalento;
		this.nomeTalento = nomeTalento;
		this.preRequisitosTalento = preRequisitosTalento;
		this.preRequisitoPericia = preRequisitoPericia;
		this.descricao = descricao;
		
	}

	@Override
	public String toString() {
		return "Talento [idTalento=" + idTalento + ", nomeTalento=" + nomeTalento + ", preRequisitosTalento="
				+ preRequisitosTalento + ", preRequisitoPericia=" + preRequisitoPericia + ", descricao=" + descricao
				+ "]";
	}
	
	public Integer getIdTalento() {
		return idTalento;
	}
	public void setIdTalento(Integer idTalento) {
		this.idTalento = idTalento;
	}
	public String getNomeTalento() {
		return nomeTalento;
	}
	public void setNomeTalento(String nomeTalento) {
		this.nomeTalento = nomeTalento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Personagem getPersonagem() {
		return personagem;
	}
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public PreRequisitoTalentos getPreRequisitosTalento() {
		return preRequisitosTalento;
	}
	public void setPreRequisitosTalento(PreRequisitoTalentos preRequisitosTalento) {
		this.preRequisitosTalento = preRequisitosTalento;
	}
	public PreRequisitoPericia getPreRequisitoPericia() {
		return preRequisitoPericia;
	}
	public void setPreRequisitoPericia(PreRequisitoPericia preRequisitoPericia) {
		this.preRequisitoPericia = preRequisitoPericia;
	}
	
	



	

}
