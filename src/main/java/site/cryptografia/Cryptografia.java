package site.cryptografia;

import site.cadastro.Cadastro;

public class Cryptografia {
	

	
static String palavra = "jamalZAO--'='\\ASDELB1Sco!t0@@#%$5589745|latin*love@gmail.com-1-1/'k45%'.br#1975'='$'#'leleco.quarta/";
	

	public static void criptografar128(Cadastro u) {
		SimpleMD5 md5 = new SimpleMD5(u.getSenha(),palavra);
		String resp = md5.toHexString();	
		SimpleMD5 md5b = new SimpleMD5("45%'.br#1975'='$'",palavra);
		String resp2 = md5b.toHexString();		
		SimpleMD5 md5c = new SimpleMD5("'$'#'leleco.quarta/",palavra);
		String resp3 = md5c.toHexString();		
		SimpleMD5 md5d = new SimpleMD5("lsyso.com-1-1/'k45%'.br",palavra);
		String resp4 = md5d.toHexString();		
		
		u.setSenha(resp + resp2 + resp3 + resp4);
	}

}
