package basic.java8.lambda.comparator;

import basic.java8.funcional.predicate.Tshirt;

import java.util.Arrays;

public class TshirtSorterLambda {
    public static void main(String[] args) {
        Tshirt[] tshirts = {new Tshirt(10000, "red"), new Tshirt(5000, "blue"), new Tshirt(8000, "green")};

        Arrays.sort(tshirts, (t1, t2) -> t1.getPrice() - t2.getPrice());
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt);
        }
    }
}