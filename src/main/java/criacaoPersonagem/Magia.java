package criacaoPersonagem;

public class Magia {
	
	private Integer idMagia;
	private String nomeMagia;
	private Integer nivelMagia;
	private String tipoMagia;
	private String escolaMagia;
	private String tempoExecucao;
	private String alcance;
	private String area;
	private String duracao;
	private String testeResistencia;
	
	public Magia() {
		// TODO Auto-generated constructor stub
	}

	public Magia(Integer idMagia, String nomeMagia, Integer nivelMagia, String tipoMagia, String escolaMagia,
			String tempoExecucao, String alcance, String area, String duracao, String testeResistencia) {
		super();
		this.idMagia = idMagia;
		this.nomeMagia = nomeMagia;
		this.nivelMagia = nivelMagia;
		this.tipoMagia = tipoMagia;
		this.escolaMagia = escolaMagia;
		this.tempoExecucao = tempoExecucao;
		this.alcance = alcance;
		this.area = area;
		this.duracao = duracao;
		this.testeResistencia = testeResistencia;
	}

	@Override
	public String toString() {
		return "Magia [idMagia=" + idMagia + ", nomeMagia=" + nomeMagia + ", nivelMagia=" + nivelMagia + ", tipoMagia="
				+ tipoMagia + ", escolaMagia=" + escolaMagia + ", tempoExecucao=" + tempoExecucao + ", alcance="
				+ alcance + ", area=" + area + ", duracao=" + duracao + ", testeResistencia=" + testeResistencia + "]";
	}

	public Integer getIdMagia() {
		return idMagia;
	}
	public void setIdMagia(Integer idMagia) {
		this.idMagia = idMagia;
	}
	public String getNomeMagia() {
		return nomeMagia;
	}
	public void setNomeMagia(String nomeMagia) {
		this.nomeMagia = nomeMagia;
	}
	public Integer getNivelMagia() {
		return nivelMagia;
	}
	public void setNivelMagia(Integer nivelMagia) {
		this.nivelMagia = nivelMagia;
	}
	public String getTipoMagia() {
		return tipoMagia;
	}
	public void setTipoMagia(String tipoMagia) {
		this.tipoMagia = tipoMagia;
	}
	public String getEscolaMagia() {
		return escolaMagia;
	}
	public void setEscolaMagia(String escolaMagia) {
		this.escolaMagia = escolaMagia;
	}
	public String getTempoExecucao() {
		return tempoExecucao;
	}
	public void setTempoExecucao(String tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
	}
	public String getAlcance() {
		return alcance;
	}
	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getTesteResistencia() {
		return testeResistencia;
	}
	public void setTesteResistencia(String testeResistencia) {
		this.testeResistencia = testeResistencia;
	}
	

}
