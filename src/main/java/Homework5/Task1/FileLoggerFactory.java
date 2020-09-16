package Homework5.Task1;

public class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
