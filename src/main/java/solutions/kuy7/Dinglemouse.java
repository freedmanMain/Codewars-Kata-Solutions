package solutions.kuy7;

public class Dinglemouse {
    public static String[] split(final String joint) {
        return joint.isEmpty() ? new String[0] : joint.split("\\.", -1);
    }

}
