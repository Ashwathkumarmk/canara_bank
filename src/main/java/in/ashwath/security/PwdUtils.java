package in.ashwath.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {
	
	public String EncryptPwd(String pwd) {
		Encoder encoder=Base64.getEncoder();
		byte[] arr=encoder.encode(pwd.getBytes());
		String passWord=new String(arr);
		return passWord;
	}

}
