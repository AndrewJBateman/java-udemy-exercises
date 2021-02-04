public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // subtract from goal total: bigCount value of flour
        goal -= Math.min(goal/5, bigCount) * 5;
        // check enough smallCount left to cover remaining goal amount
        return smallCount - goal >= 0;
    }
}
