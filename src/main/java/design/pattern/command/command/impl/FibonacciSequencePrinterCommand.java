package design.pattern.command.command.impl;

import design.pattern.command.command.Command;
import design.pattern.command.model.fibonacci.FibonacciSequencePrinter;

public class FibonacciSequencePrinterCommand implements Command {
    private final FibonacciSequencePrinter receiver;

    public FibonacciSequencePrinterCommand(FibonacciSequencePrinter receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.calculate();
    }
}
