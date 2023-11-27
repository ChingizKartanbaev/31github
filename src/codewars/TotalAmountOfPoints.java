package codewars;

public class TotalAmountOfPoints {

    public static void main(String[] args) {
        String [] arr = {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};
        System.out.println(points(arr));

    }

    public static int points(String[] games) {
        int result = 0;

        for (int i = 0; i < games.length; i++) {
            int firstVal = Integer.parseInt(String.valueOf(games[i].charAt(0)));
            int secondVal = Integer.parseInt(String.valueOf(games[i].charAt(2)));

            if (firstVal > secondVal) {
                result += 3;
            } else if(firstVal == secondVal) {
                result += 1;
            } else {
                result += 0;
            };
        }

        return result;
    }
}
