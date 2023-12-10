package codewars;

public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        return (name.startsWith("R") || name.startsWith("r")) ? name + " plays banjo" : name + " does not play banjo";
    }
}
