package basic.quiz;

import java.util.*;

public class BinaryCadinality {
    public static void main(String[] args) {
        int[] numbers = {11, 12, 13, 14, 15, 16, 17};
        int[] result = cardinalirySort(numbers);

        System.out.println("결과 =");
        System.out.println(Arrays.toString(result));
    }

    static int[] cardinalirySort(int[] nums) {
        Map<Integer, Integer> unsortMap = new HashMap<>();
        int size = nums.length;
        int[] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            String binaryString = Integer.toBinaryString(nums[i]);
            char[] chars = binaryString.toCharArray();

            int count = 0;
            for (char c : chars) {
                if (c == '1') {
                    count += Character.getNumericValue(c);
                }
            }
            unsortMap.put(nums[i], count);
        }

        Map<Integer, Integer> valueMap = new LinkedHashMap<>();
        Map<Integer, Integer> keyMap = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByKey())
                .forEachOrdered(x -> valueMap.put(x.getKey(), x.getValue()));


        valueMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue())
                .forEachOrdered(x -> keyMap.put(x.getKey(), x.getValue()));


        System.out.println("keyMap: " + keyMap);

        Iterator<Integer> iter = keyMap.keySet().iterator();
        int index = 0;
        while (iter.hasNext()) {
            arrays[index] = iter.next();
            index++;
        }
        return arrays;
    }
}
