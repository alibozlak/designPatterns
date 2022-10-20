package AbstractFactoryDesign;

public class Factory1 extends CrossCuttingCorcernsFactory {

    @Override
    public Logging createLogger() {
        return new Log4NetLogger();
    }

    @Override
    public Caching createCaching() {
        return new RedisCache();
    }
    
}
