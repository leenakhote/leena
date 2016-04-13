# leena
java programs
public class EvenOrOdd {

    public static int CheckEvenOrOdd(int num) {
        if (num > 2) {
            int number = num - 2;
            num = CheckEvenOrOdd(number);
        }
        return num;
    }

    public static void main(String[] args) {
        int num = CheckEvenOrOdd(5322221);
        if (num == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
    }

}
