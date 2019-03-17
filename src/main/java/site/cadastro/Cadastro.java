package site.cadastro;

import java.io.Serializable;

public class Cadastro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String email;
	private String senha;
	private Integer ativo;

	
	public Cadastro() {
		// TODO Auto-generated constructor stub
	}


	public Cadastro(Integer id, String email, String senha, Integer ativo) {		
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
	}


	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", email=" + email + ", ativo" + ativo +"]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Integer getAtivo() {
		return ativo;
	}


	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
