public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        } else {
            // get lower of the two numbers
            int lowerNum = Math.min(first, second);
            int divisor = lowerNum;
            int count = lowerNum;
            while( count > 1 ) {
                if(first % count == 0 && second % count == 0) {
                    divisor = count;
                    return divisor;
                }
                count--;
            }
            return divisor;
        }
    }

}
