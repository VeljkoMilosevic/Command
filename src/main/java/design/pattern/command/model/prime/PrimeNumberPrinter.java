package design.pattern.command.model.prime;

public class PrimeNumberPrinter {

    int primeNumberOrdinal = 0;

    public void calculate() {
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.println(String.format("'%s' prime number is '%s'", ++primeNumberOrdinal, i));
            }
        }
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
