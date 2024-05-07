package basic.complexity;

import java.util.Random;

public class ComplexityTest {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        int target = 9999999;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000000); // 0 ~ 9999999 무작위
        }
        // 이진 검색 수행 및 실행 시간 측정
        long startTime = System.nanoTime();
        int binarySearchResult = binarySearch(arr, target);

        long endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        // 선형 검색 수행 및 실행 시간 측정
        startTime = System.nanoTime();
        int linearSearchResult = linearSearch(arr, target);
        endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        // 결과
        System.out.println("이진 검색 :" + binarySearchResult);
        System.out.println("이진 실행 시간 :" +  binarySearchTime);

        System.out.println("선형 검색 :" +  linearSearchResult);
        System.out.println("선형 실행 시간 :" + linearSearchTime);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1;
            }
        }
        return -1;
    }
}
