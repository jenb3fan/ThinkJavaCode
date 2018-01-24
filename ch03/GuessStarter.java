import java.util.Random;
import java.util.Scanner;

public class GuessStarter
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int numberGenerated = random.nextInt(100) + 1;
        System.out.println("Generated Number is: " + numberGenerated);

        int guessNumber;
        int variance;
        System.out.println("I'm thinking of a number between 1 and 100. ");
        System.out.println("Can you guess what it is? ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        guessNumber = scanner.nextInt();

        System.out.println("Your guess is: " + guessNumber);
        System.out.println("The number I was thinking of was: " + numberGenerated);

        variance = numberGenerated % guessNumber;
        System.out.println("You were off by: " + variance);
    }

}