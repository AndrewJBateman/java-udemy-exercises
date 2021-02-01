public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        } else {
            int num = number; // copy of number for loop
            int evenSum = 0;
            while(num > 0){
                int lastDigit = num % 10; // use remainder to get last digit
                if(lastDigit % 2 == 0) {
                    evenSum += lastDigit; // if number even add to sum
                    System.out.println("evenSum is: " + evenSum);
                }
                num /= 10; // divide by 10 to get next digit
            }
            return evenSum;
        }
    }

}
