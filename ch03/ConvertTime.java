import java.util.Scanner;

public class ConvertTime
{
    public static void main(String[] args)

    {

        Scanner in = new Scanner(System.in);
        System.out.print("Seconds to Input:");
        int inputNumber = in.nextInt();

        int hour = inputNumber / 3600;
        int seconds = inputNumber % 3600;
        int minute = seconds / 60;
        seconds = seconds % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", inputNumber, hour, minute, seconds);


    }


}