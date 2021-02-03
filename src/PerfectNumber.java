public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int sumDivisors = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i < number; i++) {
                if(number % i == 0) {
                    sumDivisors += i;
                }
            }
        }
        return (sumDivisors == number);
    }

}
