package basic;

import java.util.Arrays;

public class PlusMinusGroup {
    // 배열 numbers에 음수, 양수, 0 등의 숫자가 임의로 들어가 있다. 유형별로 개수 파악해 비율로 표시
    // 단, 소수점은 6자리까지 표현

    public static void main(String[] args) {
        int[] numbers = {-12, 33, -4, 0, 0, 9, 1, -2, 11, 0};
        float[] items = itemCount(numbers, numbers.length);

        // 소수점 아래 6
        System.out.println("positive: %.6f\n, items[0]");
        System.out.println("negative: %.6f\n, items[1]");
        System.out.println("zero: %.6f\n, items[2]");
    }

    private static float[] itemCount(int[] numbers, int length) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] > 0) {
                positives++;
            } else if (numbers[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
            // Arrays.stream
//            long positives = Arrays.stream(numbers).filter(num -> num > 0).count();
//            long negatives = Arrays.stream(numbers).filter(num -> num < 0).count();
//            long zeros = Arrays.stream(numbers).filter(num -> num == 0).count();
            float point = (float) length;
            float positive = positives / point;
            float negative = negatives / point;
            float zero = zeros / point;

            float[] results = {positive, negative, zero};
            return results;
        }
        return null;
    }
}
