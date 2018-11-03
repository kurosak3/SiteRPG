package criacaoPersonagem;

public class Magia {
	
	private Integer idMagia;
	private Integer nivelMagia;
	private String nomeMagia;
	private String tipoMagia;
	private String tempoExecucao;
	private String alcance;
	private String alvo;
	private String duracao;
	private String testeResistencia;
	
	public Magia() {
		// TODO Auto-generated constructor stub
	}

	public Magia(Integer idMagia, Integer nivelMagia, String nomeMagia, String tipoMagia, String tempoExecucao,
			String alcance, String alvo, String duracao, String testeResistencia) {
		super();
		this.idMagia = idMagia;
		this.nivelMagia = nivelMagia;
		this.nomeMagia = nomeMagia;
		this.tipoMagia = tipoMagia;
		this.tempoExecucao = tempoExecucao;
		this.alcance = alcance;
		this.alvo = alvo;
		this.duracao = duracao;
		this.testeResistencia = testeResistencia;
	}

	@Override
	public String toString() {
		return "Magia [idMagia=" + idMagia + ", nivelMagia=" + nivelMagia + ", nomeMagia=" + nomeMagia + ", tipoMagia="
				+ tipoMagia + ", tempoExecucao=" + tempoExecucao + ", alcance=" + alcance + ", alvo=" + alvo
				+ ", duracao=" + duracao + ", testeResistencia=" + testeResistencia + "]";
	}

	public Integer getIdMagia() {
		return idMagia;
	}

	public void setIdMagia(Integer idMagia) {
		this.idMagia = idMagia;
	}

	public Integer getNivelMagia() {
		return nivelMagia;
	}

	public void setNivelMagia(Integer nivelMagia) {
		this.nivelMagia = nivelMagia;
	}

	public String getNomeMagia() {
		return nomeMagia;
	}

	public void setNomeMagia(String nomeMagia) {
		this.nomeMagia = nomeMagia;
	}

	public String getTipoMagia() {
		return tipoMagia;
	}

	public void setTipoMagia(String tipoMagia) {
		this.tipoMagia = tipoMagia;
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

	public String getAlvo() {
		return alvo;
	}

	public void setAlvo(String alvo) {
		this.alvo = alvo;
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
