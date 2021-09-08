package lesson_8;

public class NineLessWork {

    public static void main(String[] args) {
        System.out.println("Вырезать подстроку из строки начиная с первого вхождения символа(А) до,\n" +
                "последнего вхождения сивола(B).");

        String string = new String("Будь как дома путник, я ни в чем не откажу");
        System.out.println(string.substring(string.indexOf("а"), string.lastIndexOf("в")));
        System.out.println();
        System.out.println(string.replace(string.charAt(3), string.charAt(0)));
        System.out.println();
        String string2 = "SATOR\nAPERO\nTENET\nOPERA\nROTAS";
        System.out.println(string2);
        String[] s = string2.split("\n");
        for (int i = 0; i < s.length; i++) {
            if (ispolindrom(s[i]));
            System.out.println(s[i]);
//            for (int j = 0; j < s[i].length() / 2 + 1; j++) {
//                if (j == s[i].length() / 2) {
//                    System.out.println(s[i]);
//                }
//                if (s[i].charAt(j) != s[i].charAt(s[i].length() - j - 1)) {
//                    break;
//                }
            }
        }

    private static boolean ispolindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString().equals(line);
    }
}
