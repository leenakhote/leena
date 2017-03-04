import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by sony on 6/16/2016.
 */

class TestClass {
    public static void main(String args[] ) throws Exception {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long testCases = Integer.parseInt(br.readLine());
            String input = br.readLine();
            long n1 = Integer.parseInt(input.split(" ")[0]);
            n1 += Integer.parseInt(input.split(" ")[1]);
            System.out.println(n1);
        }
        catch(Exception e) {
            System.out.println("Enter a number between 1 to 1000000000");
        }
    }

}


