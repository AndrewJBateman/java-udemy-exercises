public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        } else {
            int num = number; // copy of number for loop
            int lastDigit = number % 10;
            System.out.println("lastDigit is: " + lastDigit);
            while(num >= 10){
                num /= 10; // make number less than 10 to get first digit
            }
            int firstDigit = num;
            System.out.println("firstDigit is: " + firstDigit);
            return lastDigit + firstDigit;
        }
    }

}
