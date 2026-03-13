package DSA.String;

public class S1 {

    public static void main(String[] args) {
        String s1 = "ad3cdd4csf8";
        System.out.println(ShiftDigit(s1));
    }

    public static String ShiftDigit(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                rev = rev + c;
            } else {
                rev = c + rev;
            }
        }
        return rev;
    }
}
