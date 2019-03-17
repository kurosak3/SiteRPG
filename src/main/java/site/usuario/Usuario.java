package site.usuario;

import java.io.Serializable;
import java.util.Date;

import site.cadastro.Cadastro;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idUsuario;
	private String  nome;
	private Date	dataNascimento;
	private String  estadoCivil;
	private Integer telefone;
	private String  descrição;
	private String  sistemaPreferido;
	private String  interesses;
	
	
	private Cadastro cadastro;
	
	public Usuario() {
	
	}

	public Usuario(Integer idUsuario, String nome, Date dataNascimento, String estadoCivil, Integer telefone,
			String descrição, String sistemaPreferido, String interesses, Cadastro cadastro) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.telefone = telefone;
		this.descrição = descrição;
		this.sistemaPreferido = sistemaPreferido;
		this.interesses = interesses;
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", estadoCivil=" + estadoCivil + ", telefone=" + telefone + ", descrição=" + descrição
				+ ", sistemaPreferido=" + sistemaPreferido + ", interesses=" + interesses + ", cadastro=" + cadastro
				+ "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getSistemaPreferido() {
		return sistemaPreferido;
	}

	public void setSistemaPreferido(String sistemaPreferido) {
		this.sistemaPreferido = sistemaPreferido;
	}

	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
