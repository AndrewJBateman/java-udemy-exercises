public class LargestPrime {

    public static int getLargestPrime (int number) {
        if(number <= 1) {
            return -1;
        }
        int i = 0;
        for (i=2; i <= number; i++) {
            // divide number by i when no remainder (when i is a factor of number)
            // until i and number converge
            if(number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }

}
