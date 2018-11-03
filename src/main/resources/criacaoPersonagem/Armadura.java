package criacaoPersonagem;

import java.util.ArrayList;
import java.util.List;

public class Armadura {
	
	private Integer idArmadura;
	private String nomeArmadura;
	private Double precoArmadura;
	private Double pesoArmadura;
	private String descricaoArmadura;
	private Integer defesaArmadura;
	private Integer maximoDestreza;
	private Integer penalidadeArmadura;
	private String tipoArmadura;
	private String tamanhoArmadura;
	private String materiaEspecialArmadura;
	
	public Armadura() {
		// TODO Auto-generated constructor stub
	}

	public Armadura(Integer idArmadura, String nomeArmadura, Double precoArmadura, Double pesoArmadura,
			String descricaoArmadura, Integer defesaArmadura, Integer maximoDestreza, Integer penalidadeArmadura,
			String tipoArmadura, String tamanhoArmadura, String materiaEspecialArmadura) {
		super();
		this.idArmadura = idArmadura;
		this.nomeArmadura = nomeArmadura;
		this.precoArmadura = precoArmadura;
		this.pesoArmadura = pesoArmadura;
		this.descricaoArmadura = descricaoArmadura;
		this.defesaArmadura = defesaArmadura;
		this.maximoDestreza = maximoDestreza;
		this.penalidadeArmadura = penalidadeArmadura;
		this.tipoArmadura = tipoArmadura;
		this.tamanhoArmadura = tamanhoArmadura;
		this.materiaEspecialArmadura = materiaEspecialArmadura;
	}

	@Override
	public String toString() {
		return "Armadura [idArmadura=" + idArmadura + ", nomeArmadura=" + nomeArmadura + ", precoArmadura="
				+ precoArmadura + ", pesoArmadura=" + pesoArmadura + ", descricaoArmadura=" + descricaoArmadura
				+ ", defesaArmadura=" + defesaArmadura + ", maximoDestreza=" + maximoDestreza + ", penalidadeArmadura="
				+ penalidadeArmadura + ", tipoArmadura=" + tipoArmadura + ", tamanhoArmadura=" + tamanhoArmadura
				+ ", materiaEspecialArmadura=" + materiaEspecialArmadura + "]";
	}

	public Integer getIdArmadura() {
		return idArmadura;
	}

	public void setIdArmadura(Integer idArmadura) {
		this.idArmadura = idArmadura;
	}

	public String getNomeArmadura() {
		return nomeArmadura;
	}

	public void setNomeArmadura(String nomeArmadura) {
		this.nomeArmadura = nomeArmadura;
	}

	public Double getPrecoArmadura() {
		return precoArmadura;
	}

	public void setPrecoArmadura(Double precoArmadura) {
		this.precoArmadura = precoArmadura;
	}

	public Double getPesoArmadura() {
		return pesoArmadura;
	}

	public void setPesoArmadura(Double pesoArmadura) {
		this.pesoArmadura = pesoArmadura;
	}

	public String getDescricaoArmadura() {
		return descricaoArmadura;
	}

	public void setDescricaoArmadura(String descricaoArmadura) {
		this.descricaoArmadura = descricaoArmadura;
	}

	public Integer getDefesaArmadura() {
		return defesaArmadura;
	}

	public void setDefesaArmadura(Integer defesaArmadura) {
		this.defesaArmadura = defesaArmadura;
	}

	public Integer getMaximoDestreza() {
		return maximoDestreza;
	}

	public void setMaximoDestreza(Integer maximoDestreza) {
		this.maximoDestreza = maximoDestreza;
	}

	public Integer getPenalidadeArmadura() {
		return penalidadeArmadura;
	}

	public void setPenalidadeArmadura(Integer penalidadeArmadura) {
		this.penalidadeArmadura = penalidadeArmadura;
	}

	public String getTipoArmadura() {
		return tipoArmadura;
	}

	public void setTipoArmadura(String tipoArmadura) {
		this.tipoArmadura = tipoArmadura;
	}

	public String getTamanhoArmadura() {
		return tamanhoArmadura;
	}

	public void setTamanhoArmadura(String tamanhoArmadura) {
		this.tamanhoArmadura = tamanhoArmadura;
	}

	public String getMateriaEspecialArmadura() {
		return materiaEspecialArmadura;
	}

	public void setMateriaEspecialArmadura(String materiaEspecialArmadura) {
		this.materiaEspecialArmadura = materiaEspecialArmadura;
	}
	
	public static List<Armadura> listaArmaduras() {
			 {ArrayList<Armadura> armaduras = new ArrayList<Armadura>();
					armaduras.add(new Armadura(1, "Armadura acolchoada", 5., 5., "Composta por várias camadas de tecido sobrepostas. É a armadura mas leve, mas também a que oferece menos proteção", 1, 26, 0, "leve", "m", "nenhum"));
					
					///armaduras.add(new  Armadura(idArmadura, nomeArmadura, precoArmadura, pesoArmadura, descricaoArmadura, defesaArmadura, maximoDestreza, penalidadeArmadura, tipoArmadura, tamanhoArmadura, materiaEspecialArmadura))
		      return armaduras;
	         }
	 }

}
