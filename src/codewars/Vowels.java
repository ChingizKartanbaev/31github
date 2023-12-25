package codewars;

public class Vowels {

    public static void main(String[] args) {
        System.out.println(getCount("awfwqgtyhure"));
    }

    public static int getCount(String str) {
        int count = 0;

        String[] strings = str.split("");

        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("a") || strings[i].equals("e") || strings[i].equals("i") || strings[i].equals("o") || strings[i].equals("u")) {
                count++;
            }
        }

        return count;
    }
}
