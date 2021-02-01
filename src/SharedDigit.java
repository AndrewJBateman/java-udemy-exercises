public class SharedDigit {

    public static boolean getEvenDigitSum(int number1, int number2) {

        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        } else {
            int num1 = number1;
            int num2 = number2;
            int num1LastDigit = num1 % 10;
            int num2LastDigit = num2 % 10;
            int num1FirstDigit = num1 / 10;
            int num2FirstDigit = num2 / 10;
            return (num1FirstDigit == num2FirstDigit) || (num1FirstDigit == num2LastDigit) || (num1LastDigit == num2FirstDigit) || (num1LastDigit == num2LastDigit);
        }
    }

}
