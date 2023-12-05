package codewars;

public class HowGoodAreYouReally {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int res = 0;
        for (int el : classPoints) {
            res += el;
        }

        return res / classPoints.length < yourPoints;
    }

}

