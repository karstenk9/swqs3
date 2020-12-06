import java.util.Objects;

public class Calculator implements ICalculator {

    public Integer add(Integer summandA, Integer summandB) {
        if (Objects.isNull(summandA) || Objects.isNull(summandB)) {
            throw new IllegalArgumentException();
        }
        return summandA + summandB;
    }

    public Integer subtract(Integer minuend, Integer subtrahend) {
        if (Objects.isNull(minuend) || Objects.isNull(subtrahend)) {
            throw new IllegalArgumentException();
        }
        return minuend - subtrahend;
    }

    public Integer multiply(Integer multiplicand, Integer multiplier) {
        if (Objects.isNull(multiplicand) || Objects.isNull(multiplier)) {
            throw new IllegalArgumentException();
        }
        return multiplicand * multiplier;
    }

    public Integer divide(Integer dividend, Integer divisor) {
        if (Objects.isNull(dividend) || Objects.isNull(divisor) || divisor.equals(0)) {
            throw new IllegalArgumentException();
        }
        return dividend / divisor;

    }
}
