package FactoryMethodDesign;

public class LoggerFactory implements ILoggerFactory {

    @Override
    public Logger createLogger() {
        // *** Amacına göre Logger verilebilir. ***
        return new EdLogger();
    }
}
