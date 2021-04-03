package solutions.kuy7;

public class GpsSpeed {
    public static int gps(int s, double[] x) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < x.length - 1; i++) {
            double averageSpeed = 3600 * (x[i + 1] - x[i]) / s;
            if (max < averageSpeed) {
                max = averageSpeed;
            }
        }

        // Math.max( value1, value2) -> value2

        // Math.max (x[i + 1], x[i]) ->
        return (int) Math.floor(max);
    }
}
