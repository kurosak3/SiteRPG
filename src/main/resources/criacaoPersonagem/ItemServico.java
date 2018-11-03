package criacaoPersonagem;

public class ItemServico {
	
	private Integer idItemServico;
	private String nomeItemServico;
	private Double precoItemServico;
	private Double pesoItemServico;
	private String descricaoItemServico;
	
	public ItemServico() {
		// TODO Auto-generated constructor stub
	}

	public ItemServico(Integer idItemServico, String nomeItemServico, Double precoItemServico, Double pesoItemServico,
			String descricaoItemServico) {
		super();
		this.idItemServico = idItemServico;
		this.nomeItemServico = nomeItemServico;
		this.precoItemServico = precoItemServico;
		this.pesoItemServico = pesoItemServico;
		this.descricaoItemServico = descricaoItemServico;
	}

	@Override
	public String toString() {
		return "ItemServico [idItemServico=" + idItemServico + ", nomeItemServico=" + nomeItemServico
				+ ", precoItemServico=" + precoItemServico + ", pesoItemServico=" + pesoItemServico
				+ ", descricaoItemServico=" + descricaoItemServico + "]";
	}

	public Integer getIdItemServico() {
		return idItemServico;
	}

	public void setIdItemServico(Integer idItemServico) {
		this.idItemServico = idItemServico;
	}

	public String getNomeItemServico() {
		return nomeItemServico;
	}

	public void setNomeItemServico(String nomeItemServico) {
		this.nomeItemServico = nomeItemServico;
	}

	public Double getPrecoItemServico() {
		return precoItemServico;
	}

	public void setPrecoItemServico(Double precoItemServico) {
		this.precoItemServico = precoItemServico;
	}

	public Double getPesoItemServico() {
		return pesoItemServico;
	}

	public void setPesoItemServico(Double pesoItemServico) {
		this.pesoItemServico = pesoItemServico;
	}

	public String getDescricaoItemServico() {
		return descricaoItemServico;
	}

	public void setDescricaoItemServico(String descricaoItemServico) {
		this.descricaoItemServico = descricaoItemServico;
	}
	
	
	

}
