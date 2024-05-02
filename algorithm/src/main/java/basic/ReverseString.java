package basic;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCDE";
        char chars[] = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

// 함수 활용
//    public static void main(String[] args) {
//        ReverseString rs = new ReverseString();
//        System.out.println(rs.reverseStr("ABCDE"));
//
//    }
//
//    private String reverseStr(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
}
