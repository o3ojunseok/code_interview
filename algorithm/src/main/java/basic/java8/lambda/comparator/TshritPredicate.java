package basic.java8.lambda.comparator;

import basic.java8.funcional.predicate.Tshirt;

@FunctionalInterface
interface TshirtPredicate {
    public boolean test(Tshirt t);
}

class TshirtColorPredicate implements TshirtPredicate {
    public boolean test(Tshirt tshirt) {
        return "red".equals(tshirt.getColor());
    }
}

class TshirtPricePredicate implements TshirtPredicate {
    public boolean test(Tshirt tshirt) {
        return tshirt.getPrice() > 300;
    }
}