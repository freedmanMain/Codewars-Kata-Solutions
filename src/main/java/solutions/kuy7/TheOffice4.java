package solutions.kuy7;

public class TheOffice4 {
    public static Object meeting(char[] x) {
        int index = new String(x).indexOf('O');
        return index >= 0 ? index : "None available!";
    }
}
