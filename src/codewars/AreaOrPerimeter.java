package codewars;

public class AreaOrPerimeter {
    public static int  areaOrPerimeter (int l, int w) {
        return (l == w) ? (int) Math.pow(l, 2) : 2 * (l + w);
    }
}
