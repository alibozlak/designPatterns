package FactoryMethodDesign;

public class CustomerManager {

    private ILoggerFactory loggerFactory;

    public CustomerManager(ILoggerFactory loggerFactory) {
        this.loggerFactory = loggerFactory;
    }

    public void save() {
        System.out.println("Customer saved!");

        // Logger logger = new LoggerFactory().createLogger();
        // logger.log();

        loggerFactory.createLogger().log();
    }
}
