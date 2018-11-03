package criacaoPersonagem;

public class Arma {
	
	private Integer idArma;
	private String nomeArma;
	private Double precoArma;
	private Double pesoArma;
	private String descricaoArma;
	private String danoArma;
	private String distanciaArma;
	private String criticoArma;
	private String tipoArma;
	private String tamanhoArma;
	private String categoriaArma;
	private String materiaEspecialArma;
	
	
	public Arma() {
		// TODO Auto-generated constructor stub
	}
		
	public Arma(Integer idArma, String nomeArma, Double precoArma, Double pesoArma, String descricaoArma,
			String danoArma, String distanciaArma, String criticoArma, String tipoArma, String tamanhoArma,
			String categoriaArma, String materiaEspecialArma) {
		super();
		this.idArma = idArma;
		this.nomeArma = nomeArma;
		this.precoArma = precoArma;
		this.pesoArma = pesoArma;
		this.descricaoArma = descricaoArma;
		this.danoArma = danoArma;
		this.distanciaArma = distanciaArma;
		this.criticoArma = criticoArma;
		this.tipoArma = tipoArma;
		this.tamanhoArma = tamanhoArma;
		this.categoriaArma = categoriaArma;
		this.materiaEspecialArma = materiaEspecialArma;
	}

	@Override
	public String toString() {
		return "Arma [idArma=" + idArma + ", nomeArma=" + nomeArma + ", precoArma=" + precoArma + ", pesoArma="
				+ pesoArma + ", descricaoArma=" + descricaoArma + ", danoArma=" + danoArma + ", distanciaArma="
				+ distanciaArma + ", criticoArma=" + criticoArma + ", tipoArma=" + tipoArma + ", tamanhoArma="
				+ tamanhoArma + ", categoriaArma=" + categoriaArma + ", materiaEspecialArma=" + materiaEspecialArma
				+ "]";
	}

	public Integer getIdArma() {
		return idArma;
	}


	public void setIdArma(Integer idArma) {
		this.idArma = idArma;
	}


	public String getNomeArma() {
		return nomeArma;
	}


	public void setNomeArma(String nomeArma) {
		this.nomeArma = nomeArma;
	}


	public Double getPrecoArma() {
		return precoArma;
	}


	public void setPrecoArma(Double precoArma) {
		this.precoArma = precoArma;
	}


	public Double getPesoArma() {
		return pesoArma;
	}


	public void setPesoArma(Double pesoArma) {
		this.pesoArma = pesoArma;
	}


	public String getDescricaoArma() {
		return descricaoArma;
	}


	public void setDescricaoArma(String descricaoArma) {
		this.descricaoArma = descricaoArma;
	}


	public String getDanoArma() {
		return danoArma;
	}


	public void setDanoArma(String danoArma) {
		this.danoArma = danoArma;
	}


	public String getDistanciaArma() {
		return distanciaArma;
	}


	public void setDistanciaArma(String distanciaArma) {
		this.distanciaArma = distanciaArma;
	}


	public String getCriticoArma() {
		return criticoArma;
	}


	public void setCriticoArma(String criticoArma) {
		this.criticoArma = criticoArma;
	}


	public String getTipoArma() {
		return tipoArma;
	}


	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}


	public String getTamanhoArma() {
		return tamanhoArma;
	}


	public void setTamanhoArma(String tamanhoArma) {
		this.tamanhoArma = tamanhoArma;
	}


	public String getCategoriaArma() {
		return categoriaArma;
	}


	public void setCategoriaArma(String categoriaArma) {
		this.categoriaArma = categoriaArma;
	}

	public String getMateriaEspecialArma() {
		return materiaEspecialArma;
	}

	public void setMateriaEspecialArma(String materiaEspecialArma) {
		this.materiaEspecialArma = materiaEspecialArma;
	}
	

}
