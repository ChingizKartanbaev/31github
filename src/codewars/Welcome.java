//package codewars;
//
//import java.util.Map;
//
//public class Welcome {
//
//    public static void main(String[] args) {
//        System.out.println(greet("english"));
//    }
//
//    public static String greet(String language){
//        Map<String, String> languageMap = Map.ofEntries(
//                Map.entry("english", "Welcome"),
//                Map.entry("czech", "Vitejte"),
//                Map.entry("danish", "Velkomst"),
//                Map.entry("dutch", "Welkom"),
//                Map.entry("estonian", "Tere tulemast"),
//                Map.entry("finnish", "Tervetuloa"),
//                Map.entry("flemish", "Welgekomen"),
//                Map.entry("french", "Bienvenue"),
//                Map.entry("german", "Willkommen"),
//                Map.entry("irish", "Failte"),
//                Map.entry("italian", "Benvenuto"),
//                Map.entry("latvian", "Gaidits"),
//                Map.entry("lithuanian", "Laukiamas"),
//                Map.entry("polish", "Witamy"),
//                Map.entry("spanish", "Bienvenido"),
//                Map.entry("swedish", "Valkommen"),
//                Map.entry("welsh", "Croeso")
//        );
//        return languageMap.get(language.toLowerCase());
//    }
//}
