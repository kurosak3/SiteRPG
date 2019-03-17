package tormentaRpg.criacaoPersonagem;



public class Pericia {
	
	private Integer idPericia;
	private String nomePericia;
	private Integer graduacao;
	private Integer modAtributo;
	private Integer penalidade;
	private Integer modOutros;
	
	private Classe classe;
	
	
	public Pericia() {
		
	}	
	
	
	public Pericia(Integer idPericia, String nomePericia, Integer graduacao, Integer modAtributo, Integer penalidade,
			Integer modOutros, Classe classe) {
		super();
		this.idPericia = idPericia;
		this.nomePericia = nomePericia;
		this.graduacao = graduacao;
		this.modAtributo = modAtributo;
		this.penalidade = penalidade;
		this.modOutros = modOutros;
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Pericia [idPericia=" + idPericia + ", nomePericia=" + nomePericia + ", graduacao=" + graduacao
				+ ", modAtributo=" + modAtributo + ", penalidade=" + penalidade + ", classe=" + classe + "]";
	}

	public Integer getIdPericia() {
		return idPericia;
	}
	public void setIdPericia(Integer idPericia) {
		this.idPericia = idPericia;
	}
	public String getNomePericia() {
		return nomePericia;
	}
	public void setNomePericia(String nomePericia) {
		this.nomePericia = nomePericia;
	}	
	public Integer getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(Integer graduacao) {
		this.graduacao = graduacao;
	}
	public Integer getModAtributo() {
		return modAtributo;
	}
	public void setModAtributo(Integer modAtributo) {
		this.modAtributo = modAtributo;
	}
	public Integer getPenalidade() {
		return penalidade;
	}
	public void setPenalidade(Integer penalidade) {
		this.penalidade = penalidade;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Integer getModOutros() {
		return modOutros;
	}
	public void setModOutros(Integer modOutros) {
		this.modOutros = modOutros;
	}
	
	
	
	

}
