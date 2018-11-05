package criacaoPersonagem;



public class Pericia {
	
	private Integer idPericia;
	private String nomePericia;
	private Double graduacao = 0.;
	
	private Classe classe;
	
	
	public Pericia() {
		// TODO Auto-generated constructor stub
	}
	public Pericia(Integer idPericia, String nomePericia,Double graduacao, Classe classe) {
		super();
		this.idPericia = idPericia;		
		this.nomePericia = nomePericia;
		this.graduacao = graduacao;
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Pericia [idPericia=" + idPericia + ", preRequisitoAtributo=" + 
				 nomePericia + ", graduacao=" + graduacao + ", classe=" + classe
				+ "]";
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
	public Double getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(Double graduacao) {
		this.graduacao = graduacao;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	
	

}
