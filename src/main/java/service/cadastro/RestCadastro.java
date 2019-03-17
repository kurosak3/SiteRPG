package service.cadastro;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dao.cadastro.cadastroDao;
import dao.usuario.UsuarioDao;
import site.cadastro.Cadastro;
import site.cadastro.EnviarEmailAtivacao;
import site.usuario.Usuario;



@Path("/rs")
public class RestCadastro {
	
	@POST
	@Path("/gravar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String gravar(String cadastro) {
		try {
			Cadastro cas = new Gson().fromJson(cadastro, Cadastro.class);
			cadastroDao cd = new cadastroDao();
			Usuario usu = new Usuario();
			cd.gravar(cas);
			EnviarEmailAtivacao.enviarEmail(cas);
			new UsuarioDao().gravarUsuario(usu, cas.getEmail());
			return "Cadastro realizado com sucesso";
		}catch (Exception ex) {
			return "Error:" +ex.getMessage();
		}
	}
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String create(@FormParam("email") String email,
						 @FormParam("senha") String senha) {
		try {
			Cadastro cas = new Cadastro();
			Usuario usu = new Usuario();
			cas.setEmail(email);
			cas.setSenha(senha);
			cadastroDao cd = new cadastroDao();
			cd.gravar(cas);
			EnviarEmailAtivacao.enviarEmail(cas);
			new UsuarioDao().gravarUsuario(usu, email);
			return "Cadastro realizado com sucesso";
		}catch (Exception ex) {
			return "Error:" +ex.getMessage();
		}
	}
	
	@POST
	@Path("/cadastra")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String cadastra(String cadastro) {
		
		try {
			Cadastro cas = new Gson().fromJson(cadastro, Cadastro.class);
			cadastroDao cd = new cadastroDao();
			cd.gravar(cas);
			Usuario usu = new Usuario();
			EnviarEmailAtivacao.enviarEmail(cas);
			new UsuarioDao().gravarUsuario(usu, cas.getEmail());
			return new Gson().toJson(cas);			
		}catch (Exception ex) {
			return "Error:" +ex.getMessage();
		}
	}
	
	@POST
	@Path("/ativacao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String ativarEmail(String cadastro) {		
		try {
			Cadastro cas = new Gson().fromJson(cadastro, Cadastro.class);
			cadastroDao cd = new cadastroDao();
			cd.ativacao(cas);			
			return "Cadastro ativado com sucesso";			
		}catch (Exception ex) {
			return "Error:" +ex.getMessage();
		}
	}
	
}
