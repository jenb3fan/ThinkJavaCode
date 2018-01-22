public class LogicMethods
{
    public static void main(String[] args)


    {
        System.out.println("Start of Program");
        printLargest(1);
        printLargest(2);
    }


    private static void printLargest(int number)

    {
        if (number > 1)
        {
            System.out.println("The Largest Number is: " + number);
        }

    }

}