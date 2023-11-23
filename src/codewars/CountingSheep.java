package codewars;

public class CountingSheep {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        if(arrayOfSheeps != null){
            for (Boolean arrayOfSheep : arrayOfSheeps) {
                try {
                    if (arrayOfSheep) {
                        count++;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            System.out.println(count);
        }

        return count;
    }
}
