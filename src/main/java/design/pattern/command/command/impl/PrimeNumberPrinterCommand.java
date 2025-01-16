package design.pattern.command.command.impl;

import design.pattern.command.command.Command;
import design.pattern.command.model.prime.PrimeNumberPrinter;

public class PrimeNumberPrinterCommand implements Command {

    private final PrimeNumberPrinter receiver;

    public PrimeNumberPrinterCommand(PrimeNumberPrinter receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.calculate();
    }
}
