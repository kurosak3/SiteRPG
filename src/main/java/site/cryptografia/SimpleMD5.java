package site.cryptografia;

import java.security.MessageDigest;

public class SimpleMD5 {
	
	MessageDigest md;
	

	  public SimpleMD5(String text, String key)
	  {
	    try
	    {
	      md = MessageDigest.getInstance("MD5");
	    } catch (java.security.NoSuchAlgorithmException e) {
	      e.printStackTrace();
	    }
	    md.update(text.getBytes());
	    md.update(key.getBytes());
	  }
	  
	  public String toHexString() {
	    byte[] encrypted = md.digest();
	    String out1 = "";
	    for (int i = 0; i < encrypted.length; i++) {
	    	for (int i1 = 0; i1 < encrypted.length; i1++) {
	      out1 = out1 + new Hexadecimal(encrypted[i1]).toFormatString(2);
	      out1 = out1 + new Hexadecimal(encrypted[i1]).toFormatString(2);
	    }
	    	}
	    return out1;
	  }

}
