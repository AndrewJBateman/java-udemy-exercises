public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

        double param1Formatted = (int) (param1 * 1000) / 1000.0;
        double param2Formatted = (int) (param2 * 1000) / 1000.0;

        System.out.println("formatted param1: " + param1Formatted);
        System.out.println("formatted param2: " + param2Formatted);

        return param1Formatted == param2Formatted;
    }

}
