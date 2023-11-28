package codewars;

public class AreaOrPerimeter {

    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(3,3));
    }

    public static int  areaOrPerimeter (int l, int w) {
        return (l == w) ? (int) Math.pow(l, 2) : 2 * (l + w);
    }
}
