package criacaoPersonagem;

import java.util.List;

import preRequisito.PreRequisitoClassePrestigio;

public class ClassePrestigio {
	
	private Long idClasse;
	private String nomeClasse;
	private String tipoDeClasse;
	private Integer nivelClasse;
	private Integer bba;	
	private List<Classe> HabilidadesDeClasse;	
	private List<Talento> talentos;
	private List<Pericia> pericias;
	private PreRequisitoClassePrestigio preRequisitoClassePrestigio;
	
	
	
	public ClassePrestigio() {
		
	}
	
	public ClassePrestigio(Long idClasse, String nomeClasse, String tipoDeClasse, Integer nivelClasse, Integer bba,
			List<Classe> habilidadesDeClasse, List<Talento> talentos, List<Pericia> pericias,
			PreRequisitoClassePrestigio preRequisitoClassePrestigio) {
		super();
		this.idClasse = idClasse;
		this.nomeClasse = nomeClasse;
		this.tipoDeClasse = tipoDeClasse;
		this.nivelClasse = nivelClasse;
		this.bba = bba;
		HabilidadesDeClasse = habilidadesDeClasse;
		this.talentos = talentos;
		this.pericias = pericias;
		this.preRequisitoClassePrestigio = preRequisitoClassePrestigio;
		
	}

	@Override
	public String toString() {
		return "ClassePrestigio [idClasse=" + idClasse + ", nomeClasse=" + nomeClasse + ", tipoDeClasse=" + tipoDeClasse
				+ ", nivelClasse=" + nivelClasse + ", bba=" + bba + ", HabilidadesDeClasse=" + HabilidadesDeClasse
				+ ", talentos=" + talentos + ", pericias=" + pericias + ", preRequisitoClassePrestigio="
				+ preRequisitoClassePrestigio + "]";
	}

	public Long getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	public String getTipoDeClasse() {
		return tipoDeClasse;
	}
	public void setTipoDeClasse(String tipoDeClasse) {
		this.tipoDeClasse = tipoDeClasse;
	}
	public Integer getNivelClasse() {
		return nivelClasse;
	}
	public void setNivelClasse(Integer nivelClasse) {
		this.nivelClasse = nivelClasse;
	}
	public Integer getBba() {
		return bba;
	}
	public void setBba(Integer bba) {
		this.bba = bba;
	}
	public List<Classe> getHabilidadesDeClasse() {
		return HabilidadesDeClasse;
	}
	public void setHabilidadesDeClasse(List<Classe> habilidadesDeClasse) {
		HabilidadesDeClasse = habilidadesDeClasse;
	}
	public List<Talento> getTalentos() {
		return talentos;
	}
	public void setTalentos(List<Talento> talentos) {
		this.talentos = talentos;
	}
	public List<Pericia> getPericias() {
		return pericias;
	}
	public void setPericias(List<Pericia> pericias) {
		this.pericias = pericias;
	}
	public PreRequisitoClassePrestigio getPreRequisitoClassePrestigio() {
		return preRequisitoClassePrestigio;
	}
	public void setPreRequisitoClassePrestigio(PreRequisitoClassePrestigio preRequisitoClassePrestigio) {
		this.preRequisitoClassePrestigio = preRequisitoClassePrestigio;
	}

	

}
