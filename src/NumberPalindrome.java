public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int convertedNumber = Math.abs(number);
        int num = Math.abs(number);

        while(num > 0) {
            int lastDigit = num % 10; // get last digit of number
            reverse *= 10; // increase place value
            reverse += lastDigit; // create reverse number
            num /= 10; // remove last digit of num
        }
        return reverse == convertedNumber;
    }

}
