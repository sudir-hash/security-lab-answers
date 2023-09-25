import java.util.*;

public class TransCipher {
    public static void main(String args[]) {
        System.out.println("Enter the plain text");
        String pl = "hello world";
        String s = pl.replaceAll("\\s", "");//replace all spaces
        int len= s.length();
        int c = 0;
        int col = 4;
        int row = (int) Math.ceil((double) len / col);
        System.out.println(len+" "+row);
        //helloworld 
        char ch[][] = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (c < len) {
                    ch[i][j] = s.charAt(c++);
                } 
            }
        }

        for (char[] cs : ch) {
            System.out.println(Arrays.toString(cs));
        }

        // arranged in matrix
        char trans[][] = new char[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = ch[i][j];
            }
        }
        String enc = "";
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                enc+=(trans[i][j]);
            }
        }
        // display
        System.out.println(enc);
    }
}