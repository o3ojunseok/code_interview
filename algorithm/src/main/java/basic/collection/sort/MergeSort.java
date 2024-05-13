package basic.collection.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] a = {2, 6, 3, 5, 1};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static Comparable[] mergeSort(Comparable[] list) {
        // 리스트가 1 이하면 연산 X
        if (list.length <= 1) {
            return list;
        }

        // 리스트를 반으로 나누어 두 부분으로 분리 -5일 경우 2,5, (2)
        Comparable[] first = new Comparable[list.length / 2];

        // 5 - 2 : 3개의 배열 요소 처리
        Comparable[] second = new Comparable[list.length - first.length];

        // 배열에서 원하는 요소를 부분을 복사. 원본, 원복 시작점, 복사본, 복사본 시작점, 길이
        System.arraycopy(list, 0, first, 0, first.length); // 첫 파트 배열 카피

        // 두 번째 파트 배열 카피
        System.arraycopy(list, first.length, second, 0, second.length);

        // 재귀 호출로 각 요소 분리 ( 첫 번째 배열 분해 후 두 번째 배열 분해)
        mergeSort(first);
        mergeSort(second);

        // 각 배열을 병합해 원래 배열에 덮어쓴다.
        merged(first, second, list);

        return list;
    }

    private static void merged(Comparable[] first, Comparable[] second, Comparable[] result) {
        // 첫 번째 배열의 인덱스 위치 - 첫 요소부터 시작
        int firstIndex = 0;

        // 두 번째 배열의 인덱스 위치 - 첫 요소부터 시작
        int secondIndex = 0;

        // 병합된 배열의 인덱스 위치 - 첫 번쨰 위치부터 시자r
        int merged = 0;

        // 첫 배열의 요소와 두 번째 배열의 요소 비교
        // 그 중 작은 요소 배열 병합에 저장
        while (firstIndex < first.length && secondIndex < second.length) {
            System.out.println(
                    "first[firstIndex] : " + first[firstIndex] +
                            ", second[secondIndex] : "
                            + second[secondIndex] + ", result = " +
                            first[firstIndex].compareTo(second[secondIndex])
            );
            if (first[firstIndex].compareTo(second[secondIndex]) < 0) {
                result[merged] = first[firstIndex];
                firstIndex++;
            } else {
                result[merged] = second[secondIndex];
                secondIndex++;
            }
            merged++;
        }
        System.arraycopy(first, firstIndex, result, merged, first.length - firstIndex);
        System.arraycopy(second, secondIndex, result, merged, second.length - secondIndex);
    }
}
