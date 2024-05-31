package basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 배열 리스트 만든다.
        List<String> al = new ArrayList<>();
        System.out.println("Initial size of al: " + al.size());

        // 배열 리스트에 요소 추가
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2"); // index 1에 A2값 추가
        System.out.println("Size of al after additions: " + al.size());

        // 배열 리스트 출력
        System.out.println("Contents of al: " + al);

        // 배열 리스트에서 요소 삭제
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}
