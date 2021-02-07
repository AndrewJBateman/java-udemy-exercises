import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int total = 0;
        int count = 0;
        double avgDouble = 0;
        long avgRounded = 0;

        while(true) {
            boolean numberBoolean = scanner.hasNextInt();
            if(numberBoolean) {
                number = scanner.nextInt();
                total += number;
                count++;
            } else {
                break;
            }
            avgDouble = total / count;
            avgRounded = Math.round(avgDouble);
        }
        System.out.println("SUM= " + total + " AVG = " + avgRounded);
    }

}
