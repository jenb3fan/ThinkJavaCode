public class Withdrawal

{

    public static void main(String[] args)
    {

        int withdrawal = 137;

        int twenties = withdrawal/ 20;
        System.out.println("Twenties: " + twenties);
        int remainderTwenties = withdrawal - twenties * 20;
        System.out.println("Left to Go: " + remainderTwenties);
        int tens = remainderTwenties/ 10;
        System.out.println("Tens: " + tens);
        int remainderTens = withdrawal - twenties * 20 - tens * 10;
        System.out.println("Left to Go: " + remainderTens);
        int fives = remainderTens/ 5;
        System.out.println("Fives:" + fives);
        int remainderFives = withdrawal - twenties * 20 - tens * 10 - fives * 5;
        System.out.println("Left to Go: " + remainderFives);
        System.out.println("Ones:" + remainderFives);





















    }


}
