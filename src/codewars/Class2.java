package codewars;

public class Class2 {


    public static String datingRange(int age) {
        int min = 0, max = 0;

        if(age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        } else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }

        return min  + "-" + max;
    }
}
