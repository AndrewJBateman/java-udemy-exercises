public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 1) {
            return -1;
        } else {
            boolean isPrime = false;
            while (!isPrime) {
                isPrime = true;
                for (int i = 2; i < number/2 + 1; i++) {
                    System.out.println("int i: " + i);
                    // if number is not a prime continue
                    if (number % i != 0) {
                        continue;
                    }
                    number /= i; // divide number by i
                    isPrime = false;
                    break;
                }
            }

            return number;
        }
    }

}
