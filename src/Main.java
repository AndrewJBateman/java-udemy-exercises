public class Main {

    public static void main(String[] args) {

//        double miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//
//        SpeedConverter.printConversion( 10.5);

//        boolean result = LeapYearCalculator.isLeapYear(2400);
//        System.out.println("result: " + result);

//        boolean result = EqualSumChecker.hasEqualSum(1, -1, 0);
//        System.out.println("result: " + result);

//        String result1 = SecondsAndMinutesChallenge.getDurationString(65, 45);
//        String result2 = SecondsAndMinutesChallenge.getDurationString(3945L);
//        String result3 = SecondsAndMinutesChallenge.getDurationString(-41);
//        String result4 = SecondsAndMinutesChallenge.getDurationString(65, 9);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);

//        double result1 = AreaCalculator.area(5.0);
//        System.out.println("area = " + result1);
//
//        double result2 = AreaCalculator.area(-1);
//        System.out.println("area = " + result2);
//
//        double result3 = AreaCalculator.area(5.0, 4.0);
//        System.out.println("area = " + result3);
//
//        double result4 = AreaCalculator.area(-1.0, 4.0);
//        System.out.println("area = " + result4);

//        String result = MinutesToYearsDaysCalculator.printYearsAndDays(561600);
//        System.out.println(result);

//        Boolean result = PlayingCat.isCatPlaying(false, 35);
//        System.out.println(result);

//        int result1 = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
//        System.out.println(result1);
//        int result2 = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
//        System.out.println(result2);
//        int result3 = NumberOfDaysInMonth.getDaysInMonth(2, 2018);
//        System.out.println(result3);
//        int result4 = NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
//        System.out.println(result4);
//        int result5 = NumberOfDaysInMonth.getDaysInMonth(1, -2020);
//        System.out.println(result5);

//        int result = SumOdd.sumOdd(100, 1000);
//        System.out.println(result);
//        int result = EvenDigitSum.getEvenDigitSum(-22);
//        System.out.println(result);
//        boolean result = SharedDigit.getEvenDigitSum(15, 55);
//        System.out.println(result);
//        boolean result = LastDigitChecker.hasSameLastDigit(9, 99, 999);
//        System.out.println(result);
//            int result = GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);
//        System.out.println(result);
//        boolean result = PerfectNumber.isPerfectNumber(-1);
//        System.out.println(result);
//        NumberToWords.numberToWords(123);
//        NumberToWords.numberToWords(1010);
//        NumberToWords.numberToWords(1000);
//        NumberToWords.numberToWords(-32);
//        NumberToWords.numberToWords(0);
//        System.out.println(NumberToWords.reverse(-121));
//        System.out.println(NumberToWords.reverse(-2));
//        System.out.println(NumberToWords.reverse(1212));
//        System.out.println(NumberToWords.reverse(1234));
//        System.out.println(NumberToWords.reverse(100));
//        Boolean result1 = FlourPackProblem.canPack(1, 0, 4);
//        System.out.println("1,0,4, false " + result1);
//        Boolean result2 = FlourPackProblem.canPack(1, 0, 5);
//        System.out.println("0,0,5, true " + result2);
//        Boolean result3 = FlourPackProblem.canPack(0, 5, 4);
//        System.out.println("0,5,4, true " + result3);
//        Boolean result4 = FlourPackProblem.canPack(2, 2, 11);
//        System.out.println("2,2,11, true " + result4);
//        Boolean result5 = FlourPackProblem.canPack(-3, 2, 12);
//        System.out.println("-3,2,12, false " + result5);
//        Boolean result6 = FlourPackProblem.canPack(0, 5, 5);
//        System.out.println("0,5,5, true " + result6);
//        Boolean result7 = FlourPackProblem.canPack(0, 5, 6);
//        System.out.println("0,5,6, false " + result7);
//        Boolean result8 = FlourPackProblem.canPack(2, 10, 18);
//        System.out.println("2,10,18, true " + result8);
//        System.out.println(LargestPrime.getLargestPrime(21));
//        System.out.println(LargestPrime.getLargestPrime(217));
//        System.out.println(LargestPrime.getLargestPrime(0));
//        System.out.println(LargestPrime.getLargestPrime(45));
//        System.out.println(LargestPrime.getLargestPrime(-1));
//        DiagonalStar.printSquareStar(8);
//        ReadingUserInputChallenge.ReadingUserInputChallenge();
//        MinimumAndMaximumChallenge.MinAndMaxChallenge();
//        InputCalculator.inputThenPrintSumAndAverage();
        int result1 = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println("result: " + result1);
        int result2 = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println("result: " + result2);
        int result3 = PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println("result: " + result3);

        int result4 = PaintJob.getBucketCount(-3.4, 2.1, 1.5);
        System.out.println("result: " + result4);
        int result5 = PaintJob.getBucketCount(3.4, 2.1, 1.5);
        System.out.println("result: " + result5);
        int result6 = PaintJob.getBucketCount(7.25,4.3, 2.35);
        System.out.println("result: " + result6);

        int result7 = PaintJob.getBucketCount(3.4,1.5);
        System.out.println("result: " + result7);
        int result8 = PaintJob.getBucketCount(6.26, 2.2);
        System.out.println("result: " + result8);
        int result9 = PaintJob.getBucketCount(3.26, 0.75);
        System.out.println("result: " + result9);
    }
}
