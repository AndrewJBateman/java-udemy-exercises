public class TeenNumberChecker {

    public static boolean hasTeen(int param1, int param2, int param3) {
            return isTeen(param1) || isTeen(param2) || isTeen(param3);
    }

    public static boolean isTeen(int value) {
        return value > 12 && value < 20;
    }

}
