package basic.quiz;

public class WaterMelon {
    public String waterMelon(int n) {
//        String result = "";
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 1) {
//                result += "수";
//            } else {
//                result += "박";
//            }
//        }
//        return result;

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            stringBuffer.append(i % 2 == 1 ? "수" : "박");
        }
        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3 " + wm.waterMelon(3));
        System.out.println("n이 4 " + wm.waterMelon(4));
    }
}
