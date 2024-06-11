package basic.quiz.arrays;

 // main 메소드에 최소 10개 이상의 요소로 구성된 integer array를 정의 한 후 해당 array의 최소 값이 위치한 자리수와 그 값을 출력한다.

import java.util.*;

public class ArrayIndexPosition {
    public static void main(String[] args) {
        int[] a = new int[]{12, 44, 23, 56, 9, 23, 78, 13};

        int min = a[0];
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        System.out.println("index: " + index);
        System.out.println("min:" + min);
    }

    public static class AlgorithmsDemo {

        public static void main(String args[]) {

            // 링크드 리스트를 만들고 초기화한다.
            LinkedList<Integer> ll = new LinkedList<Integer>();
            ll.add(new Integer(-8));
            ll.add(new Integer(20));
            ll.add(new Integer(-20));
            ll.add(new Integer(8));

            // 역순의 비교자를 생성.
            Comparator<Integer> r = Collections.reverseOrder();

            // 비교자를 사용해서 리스트를 정렬한다.
            Collections.sort(ll, r);

            // 반복자를 얻는다.
            Iterator<Integer> li = ll.iterator();

            System.out.print("List sorted in reverse: ");
            while (li.hasNext()) {
                System.out.print(li.next() + " ");
            }

            System.out.println();

            Collections.shuffle(ll);

            // 임의의 리스트를 표시한다.
            li = ll.iterator();
            System.out.print("List shuffled: ");

            while (li.hasNext()) {
                System.out.print(li.next() + " ");
            }
            System.out.println();

            System.out.println("Minimum: " + Collections.min(ll));
            System.out.println("Maximum: " + Collections.max(ll));

        }
    }

    static class ArrayListDemo {
        public static void main(String args[]) {

            // 배열 리스트를 만든다.
            List<String> al = new ArrayList<>();
            System.out.println("Initial size of al: " + al.size());

            // 배열 리스트에 요소들을 추가한다.
            al.add("C");
            al.add("A");
            al.add("E");
            al.add("B");
            al.add("D");
            al.add("F");
            al.add(1, "A2");  // index 1에 A2 값을 추가함
            System.out.println("Size of al after additions: " + al.size());

            // 배열 리스트를 출력한다.
            System.out.println("Contents of al: " + al);

            // 배열 리스트에서 요소들을 삭제한다.
            al.remove("F");
            al.remove(2);

            System.out.println("Size of al after deletions: " + al.size());
            System.out.println("Contents of al: " + al);
        }
    }
}
