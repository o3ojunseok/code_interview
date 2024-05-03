package basic;

// Stack
// 후입선출 (LIFO) 구조
// 마지막에 삽입된 데이터가 가장 먼저 제거됨
// 데이터의 추가 push, 데이터의 제거 pop, 맨 위의 항목을 반환 peek
// 스택의 최상단 요소에만 접근 가능
// Queue
// 선입선출 (FIFO) 구조
// 먼저 삽입된 데이터가 가장 먼저 제거됨.
// 데이터 삽입 enqueue, 가장 앞에 있는 항목 제거 dequeue, 첫번째 값 확인 peek
// 큐의 앞과 뒤에서 모두 데이터에 접근

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println(isBalanced(expression) ? "YES" : "NO");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            String ch = expression.substring(i, i + 1);
            if (ch.equals("[") || ch.equals("{") || ch.equals("(")) {
                stack.push(ch);
            } else {
                if ((ch.equals(")"))) {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    }
                } else if (ch.equals("}")) {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek().equals("{")) {
                        stack.pop();
                    }
                } else if (ch.equals("]")) {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    }
                }
                /*
                if (stack.empty()) {
                    return false;
                }

                // 스택의 가장 위에 있는 괄호와 현재 괄호가 짝이 맞는지 확인하고, 맞으면 스택에서 제거.
                if (ch.equals(")") && stack.peek().equals("(") ||
                    ch.equals("}") && stack.peek().equals("{") ||
                    ch.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else { // 짝이 맞지 않는 경우 false를 반환.
                    return false;
                }
                */
            }
        }
        return stack.empty();
    }
}
