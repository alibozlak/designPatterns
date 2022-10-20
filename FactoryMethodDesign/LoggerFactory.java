package FactoryMethodDesign;

public class LoggerFactory implements ILoggerFactory {

    @Override
    public Logger createLogger() {      // <--- Factory Method
        
        // *** Amacına göre Logger verilebilir. ***
        return new EdLogger();
    }
}
