public class Time
{

        public static void main(String args[])

        {
            int hour = 9;
            int minute = 12;
            int second = 23;

            int secondsPerMinute = 60;
            int minutesPerHour = 60;

            int secondsSinceMidnight = (hour * minutesPerHour * secondsPerMinute) + (minute * secondsPerMinute) + second;

            System.out.println("Seconds Since Midnight: " + secondsSinceMidnight);

            int hoursPerDay = 24;

            int secondsInDay = hoursPerDay * minutesPerHour * secondsPerMinute;
            int secondsRemainingInDay = secondsInDay - secondsSinceMidnight;

            System.out.println("Seconds Remaining in The Day: " + secondsRemainingInDay);

            int percentage = 100 * secondsSinceMidnight / secondsInDay;

            System.out.println("Percent of Day that Has Passed: " + percentage);

            int currentHour = 10;
            int currentMinutes = 24;
            int currentSeconds = 38;

            System.out.print("Elapsed time of Exercise: " );
            System.out.println((currentHour - hour)+":"+(currentMinutes - minute)+":"+(currentSeconds - second));








        }




}
