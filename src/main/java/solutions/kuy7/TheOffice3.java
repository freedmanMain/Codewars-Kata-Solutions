package solutions.kuy7;

public class TheOffice3 {
    public static String broken(final String x) {
        StringBuilder builder = new StringBuilder();
        for (char ch : x.toCharArray()) {
            builder.append(ch == '1' ? '0' : '1');
        }
        return builder.toString();
    }
}
