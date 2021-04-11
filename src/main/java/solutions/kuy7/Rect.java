package solutions.kuy7;

public class Rect {
    public static int numberOfRectangles(int m, int n) {
        return (m * n * (n + 1) * (m + 1)) / 4;
    }
}
