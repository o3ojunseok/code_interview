package basic.java8.funcional.consumer;

import java.util.function.Consumer;

class PrintLength implements Consumer<String> {
    public void accept(String color) {
        System.out.println(color.length());
    }
}