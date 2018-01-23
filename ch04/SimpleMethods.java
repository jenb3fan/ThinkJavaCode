public class SimpleMethods
{
    public static void printCount(int count)

    {
        System.out.println("This count is: ");
        System.out.println(count);
    }

    public static void printSum(int num1, int num2, int num3, int num4)

    {
        System.out.println("The First Sum is: ");
        System.out.println(num1 + num2);
        System.out.println("The Second Sum is: ");
        System.out.println(num3 + num4);
    }

    public static void main(String[] args)

    {
        int count = 5;
        int num1 = 4;
        int num2 = 6;
        int num3 = 7;
        int num4 = 2;
        printCount(count);
        printSum(4, 6, 7, 2);


    }


}
