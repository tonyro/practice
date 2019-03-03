package udemy;

public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, final int goal) {
        final int BIG_BAG = 5;
        final int SMALL_BAG = 1;
        int processingGoal = goal;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int reqBigCount = 0;
        while ((processingGoal > 0) && (bigCount > 0)) {
            processingGoal -= BIG_BAG;
            if (processingGoal >= 0) {
                reqBigCount++;
            }
            bigCount--;
        }

        if ((goal - reqBigCount * BIG_BAG) > 0) {
            processingGoal = goal - reqBigCount * BIG_BAG;
        }

        while ((processingGoal > 0) && (smallCount > 0)) {
            processingGoal -= SMALL_BAG;
            smallCount--;
        }


        return processingGoal == 0;
    }


}
