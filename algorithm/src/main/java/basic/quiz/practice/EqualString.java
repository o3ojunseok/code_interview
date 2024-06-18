package basic.quiz.practice;

public class EqualString {
    public static void main(String[] args) {
        String a = "test";
        String b = new String("test");
        String c = "test";

        System.out.println("equals string a, b = " + (a == b)); // false
        System.out.println("equals string b, c = " + (c == b)); // false
        System.out.println("equals string a, c = " + (a == c)); //true

        StringBuffer ab = new StringBuffer();
        StringBuffer bb = ab.append("test");

        System.out.println("equals string buffer = " + (ab == bb)); // true
    }
}
