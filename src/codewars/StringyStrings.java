package codewars;

public class StringyStrings {

    public static void main(String[] args) {
        System.out.println(stringy(5));
    }

    public static String stringy(int size) {
        String res = "";
        for (int i = 0; i < size; i++) {
            if(res.length() <= size){
                res += "1";
                if (res.length() == size){
                    break;
                }
            }
            if(res.length() <= size){
                res += "0";
                if (res.length() == size){
                    break;
                }
            }
        }
        return res;
    }

}
