package basic.java8.funcional.predicate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Tshirt {
    private int price;
    private String color;

    public Tshirt(int price, String color) {
        this.price = price;
        this.color = color;
    }

}