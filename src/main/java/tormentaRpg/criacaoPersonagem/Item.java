package tormentaRpg.criacaoPersonagem;

public class Item {
	
	private Integer idItem;
	private String nomeItem;
	private Double pesoItem;
	private Integer precoItem;
	private String descricaoItem;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer idItem, String nomeItem, Double pesoItem, Integer precoItem, String descricaoItem) {
		super();
		this.idItem = idItem;
		this.nomeItem = nomeItem;
		this.pesoItem = pesoItem;
		this.precoItem = precoItem;
		this.descricaoItem = descricaoItem;
	}

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", nomeItem=" + nomeItem + ", pesoItem=" + pesoItem + ", precoItem="
				+ precoItem + ", descricaoItem=" + descricaoItem + "]";
	}

	public Integer getIdItem() {
		return idItem;
	}
	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public Double getPesoItem() {
		return pesoItem;
	}
	public void setPesoItem(Double pesoItem) {
		this.pesoItem = pesoItem;
	}
	public Integer getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(Integer precoItem) {
		this.precoItem = precoItem;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	

}
