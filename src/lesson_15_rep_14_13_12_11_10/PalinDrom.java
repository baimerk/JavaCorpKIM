package lesson_15_rep_14_13_12_11_10;

public class PalinDrom {
    private static boolean isPalindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString().equals(line);
    }
}
