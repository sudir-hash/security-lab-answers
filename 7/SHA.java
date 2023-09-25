import java.security.*;

public class SHA {
    public static void main(String[] a) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            System.out.println("Message digest objectinfo:\n ");
            String input = "abc";
            md.update(input.getBytes());
            String output1=bytesToHex(md.digest());
            System.out.println("message after encryption " +output1);
            input="abc";
            md.update(input.getBytes());
            String output2=bytesToHex(md.digest());
            System.out.println("message after encryption " +output2);
            System.out.println("Check "+output1.equals(output2));
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }

    private static String bytesToHex(byte[] b) {
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuffer buf = new StringBuffer();
        for (byte aB : b) {
            buf.append(hexDigit[(aB >> 4) & 0x0f]);
            buf.append(hexDigit[aB & 0x0f]);
        }
        return buf.toString();
    }
}
