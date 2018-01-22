public class LogicMethods
{
    public static void main(String[] args)

    {
        System.out.println("Start of Program");
        printIsLargeOrSmall(1);
        printIsLargeOrSmall(99);
        printIsLargeOrSmall(100);
        printIsLargeOrSmall(200);
    }

    private static void printIsLargeOrSmall(int number)
    {
        System.out.println("printIsLargeOrSmall");
        System.out.println("Number is: " + number);


        if(number >= 99)
        {
            System.out.println("The number is large " + number );
        }
        else if (number < 10)
        {
            System.out.println("The number is small " + number);
        }

        System.out.println();
    }





}
