package controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.cadastro.cadastroDao;
import site.cadastro.Cadastro;
import site.cadastro.EnviarEmailAtivacao;

@Controller
public class CadastroController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView iniciar() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/cadastrar.html", method=RequestMethod.POST)
	public ModelAndView cadastrar(Cadastro c) {
		ModelAndView mv = new ModelAndView("index");
		try {
			new cadastroDao().gravar(c);
			EnviarEmailAtivacao.enviarEmail(c);
			mv.addObject("cadatro", c);
			mv.addObject("msg", "Cadastro realizado com sucesso! Voce recebera um e-mail para ativação da conta");
		} catch (Exception e) {
			mv.addObject("msg", "Error:" +e.getMessage());	
		}		
		return mv;
	}
	
	@RequestMapping(value="/ativacao.html", method=RequestMethod.POST)
	public ModelAndView ativacao(Cadastro c) {
		ModelAndView mv = new ModelAndView("index");
		try {
			new cadastroDao().ativacao(c);
			mv.addObject("ativacao", c);
			mv.addObject("msg", "Conta ativada com sucesso!");			
		} catch (Exception e) {
			mv.addObject("msg", "Error:" +e.getMessage());	
		}		
		return mv;
	}
	
	@RequestMapping(value="/logar.html", method=RequestMethod.POST)
	public ModelAndView logar(Cadastro c) {
		ModelAndView mv = new ModelAndView("index");
		try {
			Cadastro verificar = new Cadastro();
			verificar = new cadastroDao().findByLogin(c);			
			if(verificar.getAtivo()==1) {
				mv.addObject("ativacao", c);
				mv.addObject("msg", "Conta ativada com sucesso!");	
			}else {
				mv.addObject("msg","Voce precisa Ativar a conta no e-mail Antes de realizar o login!!!"); 				
			}						
		} catch (Exception e) {
			mv.addObject("msg", "Error:" +e.getMessage());	
		}		
		return mv;
	}
	
	

}
