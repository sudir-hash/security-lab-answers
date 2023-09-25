import java.util.*;

public class TransCipher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text");
        String pl = sc.nextLine();
        sc.close();

        // getting input
        String s = pl.replaceAll("\\s", "");
        System.out.println(s);
        int k = s.length();
        int l = 0;
        int col = 4;
        int row = s.length() / col;
        char ch[][] = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (l < k) {
                    ch[i][j] = s.charAt(l);
                    l++;
                } else {
                    ch[i][j] = '#';
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
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(trans[i][j]);
            }
        }
        // display
        System.out.println();
    }
}