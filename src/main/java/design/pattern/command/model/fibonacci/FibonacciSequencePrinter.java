package design.pattern.command.model.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSequencePrinter {

    private final Map<Integer, BigInteger> cache;
    private int fibonacciNumberOrdinal;

    public FibonacciSequencePrinter() {
        cache = new HashMap<>();
        fibonacciNumberOrdinal = 0;
        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
    }

    public void calculate() {
        for (int i = 0; i <= 1000; i++) {
            BigInteger nextNumber = getNextNumber(i);
            cache.put(i, nextNumber);
            System.out.println(String.format("'%s' fibonacci sequence number is '%s'", fibonacciNumberOrdinal++, nextNumber));
        }
    }

    private BigInteger getNextNumber(int ordinalNumber) {
        if (cache.containsKey(ordinalNumber))
            return cache.get(ordinalNumber);
        return getNextNumber(ordinalNumber - 1).add(getNextNumber(ordinalNumber - 2));
    }

}
