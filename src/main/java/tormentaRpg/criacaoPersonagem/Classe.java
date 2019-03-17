package tormentaRpg.criacaoPersonagem;

import java.util.List;

public class Classe {
	
	private Long idClasse;
	private String nomeClasse;
	private String tipoDeClasse;
	private Integer nivelClasse;
	private Integer bba;	
	private List<Classe> HabilidadesDeClasse;	
	private List<Talento> talentos;
	private List<Pericia> pericias;
	
	public Classe() {
		
	}
	
	public Classe(Long idClasse, String nomeClasse, String tipoDeClasse, Integer nivelClasse, Integer bba) {
		super();
		this.idClasse = idClasse;
		this.nomeClasse = nomeClasse;
		this.tipoDeClasse = tipoDeClasse;
		this.nivelClasse = nivelClasse;
		this.bba = bba;
	}

	
	@Override
	public String toString() {
		return "Classe [idClasse=" + idClasse + ", nomeClasse=" + nomeClasse + ", tipoDeClasse=" + tipoDeClasse
				+ ", nivelClasse=" + nivelClasse + ", bba=" + bba + ", HabilidadesDeClasse=" + HabilidadesDeClasse
				+ ", talentos=" + talentos + ", pericias=" + pericias + "]";
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
	
	
	

	
}
