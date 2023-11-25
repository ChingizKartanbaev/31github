//package codewars;
//
//import java.util.Arrays;
//
//public class ANeedleInTheHaystack {
//
//    public static void main(String[] args) {
//        Object[] haystack1 = {"3", "123124234",null ,null, "needle", "world", "hay", 2, "3", true, false};
//        System.out.println(findNeedle(haystack1));
//    }
//
//    public static String findNeedle(Object[] haystack) {
//        Object[] newArray = Arrays.stream(haystack)
//                .filter(element -> element != null)
//                .toArray();
//
//
//        for (int i = 0; i < newArray.length; i++) {
//            if(newArray[i] != null) {
//                if(newArray[i].equals("needle")) {
//                    return "found the needle at position " + (i + 1 );
//                }
//            }
//        }
//
//        return null;
//    }
//
//}
//
