package criacaoPersonagem;

import java.util.List;

public class Deus {
	
	
	private Integer idDeus;
	private String nomeDeus;
	private List<String> tendencias;
	private List<String> poderesConcedidos;
	private String ObrigacoesRestricoes;
	
	public Deus() {
		// TODO Auto-generated constructor stub
	}

	public Deus(Integer idDeus, String nomeDeus, List<String> tendencias, List<String> poderesConcedidos,
			String obrigacoesRestricoes) {
		super();
		this.idDeus = idDeus;
		this.nomeDeus = nomeDeus;
		this.tendencias = tendencias;
		this.poderesConcedidos = poderesConcedidos;
		ObrigacoesRestricoes = obrigacoesRestricoes;
	}

	@Override
	public String toString() {
		return "Deus [idDeus=" + idDeus + ", nomeDeus=" + nomeDeus + ", tendencias=" + tendencias
				+ ", poderesConcedidos=" + poderesConcedidos + ", ObrigacoesRestricoes=" + ObrigacoesRestricoes + "]";
	}

	public Integer getIdDeus() {
		return idDeus;
	}
	public void setIdDeus(Integer idDeus) {
		this.idDeus = idDeus;
	}
	public String getNomeDeus() {
		return nomeDeus;
	}
	public void setNomeDeus(String nomeDeus) {
		this.nomeDeus = nomeDeus;
	}
	public List<String> getTendencias() {
		return tendencias;
	}
	public void setTendencias(List<String> tendencias) {
		this.tendencias = tendencias;
	}
	public List<String> getPoderesConcedidos() {
		return poderesConcedidos;
	}
	public void setPoderesConcedidos(List<String> poderesConcedidos) {
		this.poderesConcedidos = poderesConcedidos;
	}
	public String getObrigacoesRestricoes() {
		return ObrigacoesRestricoes;
	}
	public void setObrigacoesRestricoes(String obrigacoesRestricoes) {
		ObrigacoesRestricoes = obrigacoesRestricoes;
	}
	

}
