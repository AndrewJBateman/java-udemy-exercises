public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if(number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000) {
            return false;
        } else {
            int num1 = number1;
            int num2 = number2;
            int num3 = number3;
            int num1LastDigit = num1 % 10;
            int num2LastDigit = num2 % 10;
            int num3LastDigit = num3 % 10;
            return (num1LastDigit == num2LastDigit) || (num1LastDigit == num3LastDigit) || (num1LastDigit == num2LastDigit) || (num2LastDigit == num3LastDigit);
        }
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

}
