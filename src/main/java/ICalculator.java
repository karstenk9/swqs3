public interface ICalculator {

    /**
     *
     * @param summandA First number to add
     * @param summandB Second number to add
     * @return The sum of both summands
     */
    Integer add(Integer summandA, Integer summandB);

    /**
     *
     * @param minuend Number, from which the subtrahend should be subtracted
     * @param subtrahend Number, which should be subtracted from the minuend
     * @return The difference between the minuend and the subtrahend
     */
    Integer subtract(Integer minuend, Integer subtrahend);

    /**
     *
     * @param multiplicand Number, which should be multiplied by the multiplier
     * @param multiplier Number, with which the multiplicand should be multiplied
     * @return The product of the multiplicand and multiplier
     */
    Integer multiply(Integer multiplicand, Integer multiplier);

    /**
     *
     * @param dividend Number, which should be divided by the divisor
     * @param divisor  Number by which the dividend is to be divided
     * @return The quotient from dividend and divisor
     */
    Integer divide(Integer dividend, Integer divisor);


}
