public class ConvertAmerican

{
    private static void printAmerican(String day, String month, int date, int year)
    {
        System.out.println("American Format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println();
    }

    private static void printEuropean(String day, String month, int date, int year)
    {
        System.out.println("European Format: ");
        System.out.println(day + ", " + date + " " + month + " " + year);
    }

    public static void main(String[] args)
    {
        String day = "Monday";
        String month = "January";
        int year = 2018;
        int date = 22;

        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);

    }


}
