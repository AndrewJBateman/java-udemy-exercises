public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else if(number == 0) {
            System.out.println("Zero");
        } else {
            int revNumber = Math.abs(reverse(number));
            int digitCount = getDigitCount(number);
            int diffInNumberLength = digitCount - getDigitCount(revNumber);
            StringBuilder result = new StringBuilder();

            while(revNumber > 0) {
                int lastDigit = revNumber % 10;
                revNumber /= 10;
                switch (lastDigit) {
                    case 1:
                        result.append("One");
                        break;
                    case 2:
                        result.append("Two");
                        break;
                    case 3:
                        result.append("Three");
                        break;
                    case 4:
                        result.append("Four");
                        break;
                    case 5:
                        result.append("Five");
                        break;
                    case 6:
                        result.append("Six");
                        break;
                    case 7:
                        result.append("Seven");
                        break;
                    case 8:
                        result.append("Eight");
                        break;
                    case 9:
                        result.append("Nine");
                        break;
                    default:
                        result.append("Zero");
                }
                if(digitCount > 0) {
                    result.append(" ");
                    digitCount--;
                }


            }
            while(diffInNumberLength > 1) {
                result.append("Zero ");
                diffInNumberLength--;
            }
            if(diffInNumberLength == 1) {
                result.append("Zero");
            }

            System.out.println(result);
        }
    }

    public static int reverse(int number) {
        int isNegative = 1;
        if (number < 0) {
            isNegative = -1;
            number *= -1;
        }

        int reverse = 0;
        int loopNum = number;
        while (loopNum > 0) {
            reverse *= 10;
            reverse += loopNum % 10;
            loopNum /= 10;
        }
        return reverse * isNegative;
    }

    public static int getDigitCount(int number) {

        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
