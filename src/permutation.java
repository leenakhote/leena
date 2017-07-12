/**
 * Created by sony on 7/12/2017.
 */

// ABC
// A BC
// AB C
// A B C
public class permutation {
    public static void main(String[] args) {

        String str = "ABC";
        printpattern(str);
    }

    public static  void printpattern(String str){
        int len = str.length();
        char[] buf = new char[2*len];
        buf[0] = str.charAt(0);
        printpatternspace( str, buf, 1, 1, len);

    }

    public static void printpatternspace(String str, char[] buf,int i, int j, int n){
        if(i == n){
            buf[j] = '\0';
            System.out.println(buf);
            return;
        }
        else{
            buf[j] = str.charAt(i);
            printpatternspace(str, buf, i+1, j+1, n);

            buf[j] = ' ';
            buf[j+1] = str.charAt(i);
            printpatternspace(str, buf, i+1, j+2, n);

        }

    }

}
