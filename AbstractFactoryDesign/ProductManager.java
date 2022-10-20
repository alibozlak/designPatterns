package AbstractFactoryDesign;

public class ProductManager {

    private CrossCuttingCorcernsFactory factory;
    private Logging logging;
    private Caching caching;

    public ProductManager(CrossCuttingCorcernsFactory factory) {
        this.factory = factory;
        this.logging = factory.createLogger();
        this.caching = factory.createCaching();
    }

    public void getAll() {
        logging.log("Products listed!");
        caching.cache("Data8");
        System.out.println("Products listed!");
    }
}
