package basic.collection.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 3, 7, 10};

        int start = 0;
        int end = array.length - 1;
        quickSort(array, start, end);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        // 피봇을 정한다.
        int middle = start + (end - start) / 2;
        int pivot = array[middle];

        // 왼쪽은 피봇보다 작고 오른쪽은 피봇보다 커야 한다.
        int low = start;
        int high = end;

        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }

            while (array[high] > pivot) {
                high--;
            }

            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high++;
            }
        }

        if (start < high) {
            quickSort(array, start, high);
        }

        if (start > low) {
            quickSort(array, low, end);
        }
    }
}
