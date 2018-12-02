package criacaoPersonagem;

import java.util.List;

public class Raca {
	
	private Integer idRaca;
	private String nomeRaca;
	
	//bonus de atributos ganho
	private Integer bonusForca;
	private Integer bonusDestreza;
	private Integer bonusonstituicao;
	private Integer bonusInteligencia;
	private Integer bonusSabedoria;
	private Integer bonusCarisma;
	
	private List<String> habilidadeRaca;
	private String descricaoAtributos;
	
	public Raca() {
		// TODO Auto-generated constructor stub
	}

	

	public Raca(Integer idRaca, String nomeRaca, Integer bonusForca, Integer bonusDestreza, Integer bonusonstituicao,
			Integer bonusInteligencia, Integer bonusSabedoria, Integer bonusCarisma, String descricaoAtributos) {
		super();
		this.idRaca = idRaca;
		this.nomeRaca = nomeRaca;
		this.bonusForca = bonusForca;
		this.bonusDestreza = bonusDestreza;
		this.bonusonstituicao = bonusonstituicao;
		this.bonusInteligencia = bonusInteligencia;
		this.bonusSabedoria = bonusSabedoria;
		this.bonusCarisma = bonusCarisma;
		this.descricaoAtributos = descricaoAtributos;
	}


	@Override
	public String toString() {
		return "Raca [idRaca=" + idRaca + ", nomeRaca=" + nomeRaca + ", bonusForca=" + bonusForca + ", bonusDestreza="
				+ bonusDestreza + ", bonusonstituicao=" + bonusonstituicao + ", bonusInteligencia=" + bonusInteligencia
				+ ", bonusSabedoria=" + bonusSabedoria + ", bonusCarisma=" + bonusCarisma + ", habilidadeRaca="
				+ habilidadeRaca + ", descricaoAtributos=" + descricaoAtributos + "]";
	}



	public Integer getIdRaca() {
		return idRaca;
	}
	public void setIdRaca(Integer idRaca) {
		this.idRaca = idRaca;
	}
	public String getNomeRaca() {
		return nomeRaca;
	}
	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}
	public Integer getBonusForca() {
		return bonusForca;
	}
	public void setBonusForca(Integer bonusForca) {
		this.bonusForca = bonusForca;
	}
	public Integer getBonusDestreza() {
		return bonusDestreza;
	}
	public void setBonusDestreza(Integer bonusDestreza) {
		this.bonusDestreza = bonusDestreza;
	}
	public Integer getBonusonstituicao() {
		return bonusonstituicao;
	}
	public void setBonusonstituicao(Integer bonusonstituicao) {
		this.bonusonstituicao = bonusonstituicao;
	}
	public Integer getBonusInteligencia() {
		return bonusInteligencia;
	}
	public void setBonusInteligencia(Integer bonusInteligencia) {
		this.bonusInteligencia = bonusInteligencia;
	}
	public Integer getBonusSabedoria() {
		return bonusSabedoria;
	}
	public void setBonusSabedoria(Integer bonusSabedoria) {
		this.bonusSabedoria = bonusSabedoria;
	}
	public Integer getBonusCarisma() {
		return bonusCarisma;
	}
	public void setBonusCarisma(Integer bonusCarisma) {
		this.bonusCarisma = bonusCarisma;
	}
	public List<String> getHabilidadeRaca() {
		return habilidadeRaca;
	}
	public void setHabilidadeRaca(List<String> habilidadeRaca) {
		this.habilidadeRaca = habilidadeRaca;
	}
	public String getDescricaoAtributos() {
		return descricaoAtributos;
	}
	public void setDescricaoAtributos(String descricaoAtributos) {
		this.descricaoAtributos = descricaoAtributos;
	}
	

}
