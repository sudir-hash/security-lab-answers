import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DES {
    public static void main(String[] argv) {
        try {
            System.out.println("Message Encryption Using DES Algorithm\n ");
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();
            Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // ECB -  Electronic Code Block 
            // PKCS5Padding - padding scheme
            /*
             * 
             */
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            String text = "hello world";
            System.out.println("Message [ByteFormat] : " + text.getBytes());
            System.out.println("Message : " + new String(text));
            String textEncrypted =new String( desCipher.doFinal(text.getBytes()));
            System.out.println("Encrypted Message: " + textEncrypted);
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted.getBytes());
            System.out.println("Decrypted Message: " + new String(textDecrypted));
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
