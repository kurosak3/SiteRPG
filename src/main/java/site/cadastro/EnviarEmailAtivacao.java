package site.cadastro;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EnviarEmailAtivacao {

	private static final String HOSTNAME="smtp.gmail.com";
	
	private static final String URLATIVACAO ="";
	
	private static final String	USERNAME="sitetormentarpg@gmail.com";
	private static final String PASSWORD="Yun4w1ndy";
	
	
	 public static Email conectaEmail()throws EmailException{
	 HtmlEmail mail = new HtmlEmail();
	 mail.setHostName(HOSTNAME);
	 mail.setSmtpPort(587);	
	 mail.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
	 mail.setTLS(true);
	 mail.setSSL(true);
	 mail.setFrom(USERNAME);
	 return mail;
	 }
	 
	 public static String enviarEmail(Cadastro u) throws
	EmailException{
	 HtmlEmail email = new HtmlEmail();
	 email = (HtmlEmail) conectaEmail();
	 email.setSubject("Ativar Conta via Email" );
	 email.addTo( u.getEmail());
	 email.setCharset("utf-8");
	//ATENÇÃO PARA A URL DO SEU PROJETOo
	 String msg= "Bem vindo ao curso on-line, <br/>" + 
	"<ahref=" + URLATIVACAO + u.getEmail()+">" + "Ativar a Conta</a>";
	 email.setMsg(msg);
	 email.send();
	 return "Email Enviado com Sucesso";
	 }
	 
	 
	 public static void main(String[] args) {
		Cadastro c = new Cadastro();
		c.setId(1);
		c.setEmail("andreluispfd@yahoo.com.br");
		c.setSenha("123456");
		 try {
			enviarEmail(c);
			
			System.out.println("mensagem enviada");
		} catch (EmailException e) {
		  e.printStackTrace();
		}
	}

}
