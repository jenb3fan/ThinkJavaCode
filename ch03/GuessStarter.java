import java.util.Random;

public class GuessStarter

{
    public static void main(String[] args)

    {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        System.out.println("I'm thinking of a number between 1 and 100 ");
        System.out.println("Can you guess what it is? ");
        System.out.println("Type a number: ");

        //I am not able to enter a guessNumber

        int guessNumber = random.nextInt();
        System.out.println("Your guess is: " + guessNumber);
        System.out.println("The number I was think of is: " + number);

        int variance = number % guessNumber;
        System.out.println(variance);
        System.out.println("You were off by: " + variance);











    }

}
