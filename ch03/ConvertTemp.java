import java.util.Scanner;

public class ConvertTemp
{
    public static void main(String[] args)

    {
        double celsius;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the temperature in celsius? ");
        celsius = in.nextDouble();


        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);























    }
}
