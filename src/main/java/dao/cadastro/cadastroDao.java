package dao.cadastro;

import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import site.cadastro.Cadastro;
import site.cryptografia.Cryptografia;

public class cadastroDao extends Dao{
	
	static final String GRAVAR_CADASTRO = "INSERT INTO CADASTRO VALUES (null,?,?,0)";
	static final String LISTAR_CADASTRADOS = "SELECT * FROM CADASTRO";
	static final String BUSCAR_CADASTRO_ID = "SELECT * FROM CADASTRO WHERE ID =?";
	static final String BUSCAR_CADASTRO_EMAIL = "SELECT ID FROM CADASTRO WHERE EMAIL =?";
	static final String REDEFINIR_SENHA = "UPDATE CADASTRO SET SENHA=? WHERE EMAIL=?";
	static final String ATIVACAO_CADASTRO = "UPDATE CADASTRO SET ATIVO=1 WHERE EMAIL=?";
	static final String LOGAR = "SELECT * FROM CADASTRO WHERE EMAIL =? AND SENHA=?";
	static final String GRAVAR_USUARIO = "INSERT INTO USUARIO VALUES(null,null,null,null,null,null,null,null,?)";
	
	
	public void gravar(Cadastro c)throws Exception{
		open();
		Cryptografia.criptografar128(c);
		stmt = con.prepareStatement(GRAVAR_CADASTRO);
		stmt.setString(1, c.getEmail());
		stmt.setString(2, c.getSenha());
		stmt.execute();
		stmt.close();
		rs = stmt.getGeneratedKeys();
		if(rs.next()) {
			int key = rs.getInt(1);
			stmt = con.prepareStatement(GRAVAR_USUARIO);
			stmt.setInt(1, key);
			stmt.execute();
			stmt.close();
		}
		
		close();
	}
	
	public void redefinirSenha(Cadastro c)throws Exception{
		open();
		Cryptografia.criptografar128(c);
		stmt = con.prepareStatement(REDEFINIR_SENHA);
		stmt.setString(1, c.getSenha());
		stmt.setString(2, c.getEmail());		
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void ativacao(Cadastro c)throws Exception{
		open();
		stmt = con.prepareStatement(ATIVACAO_CADASTRO);
		stmt.setString(1, c.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public List<Cadastro> findAll() throws Exception{
		open();
		  stmt = con.prepareStatement(LISTAR_CADASTRADOS);
		  List<Cadastro> cadastrados = new ArrayList<Cadastro>();
		  rs = stmt.executeQuery();
		  while(rs.next()) {
			  Cadastro c = new Cadastro();
			  c.setId(rs.getInt("ID"));
			  c.setEmail(rs.getString("EMAIL"));
			  c.setAtivo(rs.getInt("ATIVO"));
			  cadastrados.add(c);
		  }
		close();
		return cadastrados;
	}
	
	public Cadastro findById(Integer i) throws Exception{
		open();
		  stmt = con.prepareStatement(BUSCAR_CADASTRO_ID);
		  stmt.setInt(1, i);
		  Cadastro cadastrado = null;
		  rs = stmt.executeQuery();
		  if(rs.next()) {
			  cadastrado = new Cadastro();
			  cadastrado.setId(rs.getInt("ID"));
			  cadastrado.setEmail(rs.getString("EMAIL"));
			  cadastrado.setAtivo(rs.getInt("ATIVO"));			  
		  }
		close();
		return cadastrado;
	}
	
	public Integer buscarId(String i) throws Exception{
		open();
		  stmt = con.prepareStatement(BUSCAR_CADASTRO_EMAIL);
		  stmt.setString(1, i);
		  Cadastro cadastrado = null;
		  rs = stmt.executeQuery();
		  if(rs.next()) {
			  cadastrado = new Cadastro();
			  cadastrado.setId(rs.getInt("ID"));
			  cadastrado.setEmail(rs.getString("EMAIL"));
			  cadastrado.setAtivo(rs.getInt("ATIVO"));			  
		  }
		close();
		return cadastrado.getId();
	}
	
	public Cadastro findByLogin(Cadastro c)throws Exception{
		open();
		Cryptografia.criptografar128(c);
		stmt = con.prepareStatement(LOGAR);
		 stmt.setString(1, c.getEmail());
		 stmt.setString(2, c.getEmail());
		 rs = stmt.executeQuery();
		 Cadastro logar = null;
		 if(rs.next()) {
			 logar = new Cadastro();
			 logar.setId(rs.getInt("ID"));
			 logar.setEmail(rs.getString("EMAIL"));
			 logar.setAtivo(rs.getInt("ATIVACAO"));
		 }
		close();
		return logar;		
	}

}
