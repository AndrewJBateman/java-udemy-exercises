import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void MinAndMaxChallenge() {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        while(true) {
            System.out.println("Enter number: (Enter any letter to exit)");
            boolean numberBoolean = scanner.hasNextInt();
            if(numberBoolean) {
                int numberValue = scanner.nextInt();
                if(numberValue > max) {
                    max = numberValue;
                } else {
                    min = numberValue;
                }
            } else {
                break;
            }
            System.out.println("Min value is : " + min + " and Max value is : " +  max);
        }
    }
}
