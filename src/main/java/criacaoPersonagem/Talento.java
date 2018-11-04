package criacaoPersonagem;

public class Talento {
	
	private Integer idTalento;
	private Integer preRequisitoAtributo;
	private String preRequisito;
	private String nomeTalento;
	private String descricao;
	
	private Personagem personagem;
	private Classe classe;
	
	
	public Talento() {
		// TODO Auto-generated constructor stub
	}




	public Talento(Integer idTalento, Integer preRequisitoAtributo, String preRequisito, String nomeTalento,
			String descricao, Personagem personagem, Classe classe) {
		super();
		this.idTalento = idTalento;
		this.preRequisitoAtributo = preRequisitoAtributo;
		this.preRequisito = preRequisito;
		this.nomeTalento = nomeTalento;
		this.descricao = descricao;
		this.personagem = personagem;
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Talento [idTalento=" + idTalento + ", preRequisitoAtributo=" + preRequisitoAtributo + ", preRequisito="
				+ preRequisito + ", nomeTalento=" + nomeTalento + ", descricao=" + descricao + ", personagem="
				+ personagem + ", classe=" + classe + "]";
	}


	public Integer getIdTalento() {
		return idTalento;
	}


	public void setIdTalento(Integer idTalento) {
		this.idTalento = idTalento;
	}


	public String getNomeTalento() {
		return nomeTalento;
	}


	public void setNomeTalento(String nomeTalento) {
		this.nomeTalento = nomeTalento;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Personagem getPersonagem() {
		return personagem;
	}


	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}


	public Classe getClasse() {
		return classe;
	}


	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Integer getPreRequisitoAtributo() {
		return preRequisitoAtributo;
	}

	public void setPreRequisitoAtributo(Integer preRequisitoAtributo) {
		this.preRequisitoAtributo = preRequisitoAtributo;
	}

	public String getPreRequisito() {
		return preRequisito;
	}

	public void setPreRequisito(String preRequisito) {
		this.preRequisito = preRequisito;
	}
	

}
