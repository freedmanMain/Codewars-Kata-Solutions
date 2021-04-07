package solutions.kuy7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        StringBuilder reversed = new StringBuilder();
        for (String word : original.split(" ")) {
            reversed.append(new StringBuilder(word).reverse().append(" "));
        }
        return reversed.toString().trim();
    }
}
