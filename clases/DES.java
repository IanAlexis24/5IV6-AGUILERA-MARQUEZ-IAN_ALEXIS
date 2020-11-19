package clases;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class DES {
    
  Cipher cifrados;

  Cipher descifrados;

  DES(SecretKey key) throws Exception {
      
    cifrados = Cipher.getInstance("DES");
    
    descifrados = Cipher.getInstance("DES");
    
    cifrados.init(Cipher.ENCRYPT_MODE, key);
    
    descifrados.init(Cipher.DECRYPT_MODE, key);
    
  }

  
  public String encryptDES(String str) throws Exception {
      
    byte[] colecta = str.getBytes("UTF8");

    byte[] encrip = cifrados.doFinal(colecta);
    
    return new sun.misc.BASE64Encoder().encode(encrip);
  }

  
  public String decryptDES(String str) throws Exception {
      
    byte[] descrip = new sun.misc.BASE64Decoder().decodeBuffer(str);

    byte[] coleccion = descifrados.doFinal(descrip);
    
    return new String(coleccion, "UTF8");
  }
}

