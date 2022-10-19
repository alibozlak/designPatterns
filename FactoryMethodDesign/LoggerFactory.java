package FactoryMethodDesign;

public class LoggerFactory implements ILoggerFactory {

    @Override
    public Logger createLogger() {
        return new EdLogger();
    }
}
