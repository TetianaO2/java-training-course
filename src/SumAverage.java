/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        // TODO fill in code here using for loop and replace the return statement
        int sumIntegers = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sumIntegers += i;
        }
        return sumIntegers;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        // TODO fill in code here using for each loop and replace the return statement
        int sumIntegers = 0;
        for (int number : numbers) {
            sumIntegers += number;
        }
        return sumIntegers;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        // TODO fill in code here using while loop and replace the return statement
        int i = lowerBound;
        int count = 0;
        int sumIntegers = 0;

        while (i <= upperBound) {
            sumIntegers += i;
            count++;
            i++;
        }
        return (double) sumIntegers / count;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        // TODO fill in code here using do-while loop and replace the return statement
        int sumIntegers = 0;
        int i = 0;

        do {
            sumIntegers += numbers[i];
            i++;
        } while (i < numbers.length);

        return (double) sumIntegers / numbers.length;
    }
}