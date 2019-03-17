package dao.usuario;

import java.util.Calendar;
import java.util.Date;

import dao.Dao;
import dao.cadastro.cadastroDao;
import site.usuario.Usuario;

public class UsuarioDao extends Dao{
	
	static final String GRAVAR_USUARIO = "INSERT INTO USUARIO VALUES (null,?,?,?,?,?,?,?,?)";
	static final String LISTAR_CADASTRADOS = "SELECT * FROM USUARIO";
	static final String BUSCAR_USUARIO_ID = "SELECT EMAIL FROM USUARIO WHERE ID =?";
	static final String REDEFINIR_SENHA = "UPDATE USUARIO SET SENHA=? WHERE EMAIL=?";
	static final String ATUALIZAR_USUARIO = "UPDATE USUARIO SET ATIVO=1 WHERE EMAIL=?";
	
	    
    public void gravarUsuario(Usuario c, String email)throws Exception{
		open();
		Integer id;		
		id = new cadastroDao().buscarId(email);
		stmt = con.prepareStatement(GRAVAR_USUARIO);
		stmt.setString(1, c.getNome());
	  //java.sql.Date dataParaGravar = new java.sql.Date();
	    stmt.setDate( 2, (java.sql.Date) c.getDataNascimento());
	    stmt.setString(3, c.getEstadoCivil());
	    stmt.setInt(4, c.getTelefone());
	    stmt.setString(5, c.getDescrição());
	    stmt.setString(6, c.getSistemaPreferido());
	    stmt.setString(7, c.getInteresses());
	    stmt.setInt(8, id );
		stmt.execute();
		stmt.close();
		close();
	}

}
