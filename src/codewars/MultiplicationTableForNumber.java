package codewars;

public class MultiplicationTableForNumber {

    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }

    public static String multiTable(int num) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str += i + " * " + num + " = " + (i * num) + "\n";
        }
        return str; // good luck
    }
}
