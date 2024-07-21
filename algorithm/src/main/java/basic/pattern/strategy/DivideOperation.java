package basic.pattern.strategy;

public class DivideOperation implements CalculationStrategy{
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}