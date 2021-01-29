public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int minutesInYear = 60 * 24 * 365;
        // calculate left over minutes and convert to days
        long days = (minutes % minutesInYear) / (60 * 24);
        long years = minutes / minutesInYear;
        System.out.println(minutes + " min = " + years + " y and " + days + " d" );

    }
}
