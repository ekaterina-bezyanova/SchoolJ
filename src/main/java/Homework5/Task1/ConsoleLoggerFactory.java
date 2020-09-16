package Homework5.Task1;

public class ConsoleLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
