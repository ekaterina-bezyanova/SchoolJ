package Homework5.Task1;

public class Calculator {

    private static double x;
    private static double y;

    public void addition(double x, double y) {
        LoggerFactory loggerFactory = new ConsoleLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.log("Результат сложения: " + (x + y));
    }

    public void subtraction(double x, double y) {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.log("Результат вычитания: " + (x - y));
    }

    public void multiplication(double x, double y) {
        LoggerFactory loggerFactory = new DbLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.log("Результат умножения: " + (x * y));
    }

    public void division(double x, double y) {
        LoggerFactory loggerFactory1 = new FileLoggerFactory();
        Logger logger1 = loggerFactory1.createLogger();
        logger1.log("Результат деления: " + (x / y));

        LoggerFactory loggerFactory2 = new ConsoleLoggerFactory();
        Logger logger2 = loggerFactory2.createLogger();
        logger2.log("Результат деления: " + (x / y));

        LoggerFactory loggerFactory3 = new DbLoggerFactory();
        Logger logger3 = loggerFactory3.createLogger();
        logger3.log("Результат деления: " + (x / y));
    }
}
