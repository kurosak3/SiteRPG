package tormentaRpg.preRequisito;

import java.util.List;

import tormentaRpg.criacaoPersonagem.Talento;

public class PreRequisitoTalentos {
	
	private Integer idRequisito;
	private Integer nivelPersonagem;
	private String classe;
	private Integer forca;
	private Integer destreza;
	private Integer constituicao;
	private Integer inteligencia;
	private Integer sabedoria;
	private Integer carisma;
	private Integer corpoAcorpo;
	private List<Talento> talentos;
	
	
	public PreRequisitoTalentos() {
		// TODO Auto-generated constructor stub
	}


	public PreRequisitoTalentos(Integer idRequisito, Integer nivelPersonagem, String classe, Integer forca, Integer destreza,
			Integer constituicao, Integer inteligencia, Integer sabedoria, Integer carisma, Integer corpoAcorpo,
			List<Talento> talentos) {
		super();
		this.idRequisito = idRequisito;
		this.nivelPersonagem = nivelPersonagem;
		this.classe = classe;
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.carisma = carisma;
		this.corpoAcorpo = corpoAcorpo;
		this.talentos = talentos;
	}


	@Override
	public String toString() {
		return "PreRequisito [idRequisito=" + idRequisito + ", nivelPersonagem=" + nivelPersonagem + ", classe="
				+ classe + ", forca=" + forca + ", destreza=" + destreza + ", constituicao=" + constituicao
				+ ", inteligencia=" + inteligencia + ", sabedoria=" + sabedoria + ", carisma=" + carisma
				+ ", corpoAcorpo=" + corpoAcorpo + ", talentos=" + talentos + "]";
	}


	public Integer getIdRequisito() {
		return idRequisito;
	}
	public void setIdRequisito(Integer idRequisito) {
		this.idRequisito = idRequisito;
	}
	public Integer getNivelPersonagem() {
		return nivelPersonagem;
	}
	public void setNivelPersonagem(Integer nivelPersonagem) {
		this.nivelPersonagem = nivelPersonagem;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	public Integer getDestreza() {
		return destreza;
	}
	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}
	public Integer getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(Integer constituicao) {
		this.constituicao = constituicao;
	}
	public Integer getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}
	public Integer getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(Integer sabedoria) {
		this.sabedoria = sabedoria;
	}
	public Integer getCarisma() {
		return carisma;
	}
	public void setCarisma(Integer carisma) {
		this.carisma = carisma;
	}	
	public Integer getCorpoAcorpo() {
		return corpoAcorpo;
	}
	public void setCorpoAcorpo(Integer corpoAcorpo) {
		this.corpoAcorpo = corpoAcorpo;
	}
	public List<Talento> getTalentos() {
		return talentos;
	}
	public void setTalentos(List<Talento> talentos) {
		this.talentos = talentos;
	}
	
	
	

}
