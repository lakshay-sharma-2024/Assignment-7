public class Factorial {

    public int calc(int number) throws FactorialException {
        if (number < 15 && number > 0) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        } else if (number > 15) {
            throw new FactorialException("Factorial cannot be calculated for number greater than 15");

        } else {
            throw new FactorialException("Factorial cannot be calculated for negative numbers.");
        }
    }
}