package design.pattern.command.main;

import design.pattern.command.command.Command;
import design.pattern.command.command.impl.FibonacciSequencePrinterCommand;
import design.pattern.command.command.impl.PrimeNumberPrinterCommand;
import design.pattern.command.invoker.Invoker;
import design.pattern.command.model.fibonacci.FibonacciSequencePrinter;
import design.pattern.command.model.prime.PrimeNumberPrinter;

public class Main {

    public static void main(String[] args) {
        PrimeNumberPrinter primeNumberPrinter = new PrimeNumberPrinter();
        Command primeNumberPrinterCommand = new PrimeNumberPrinterCommand(primeNumberPrinter);

        Invoker invoker = new Invoker();
        invoker.setCommand(primeNumberPrinterCommand);
        invoker.execute();

        FibonacciSequencePrinter fibonacciSequencePrinter = new FibonacciSequencePrinter();
        Command fibonacciSequencePrinterCommand = new FibonacciSequencePrinterCommand(fibonacciSequencePrinter);
        invoker.setCommand(fibonacciSequencePrinterCommand);
        invoker.execute();
    }
}