package AbstractFactoryDesign;

public class Factory2 extends CrossCuttingCorcernsFactory {

    @Override
    public Logging createLogger() {
        return new NLogger();
    }

    @Override
    public Caching createCaching() {
        return new RedisCache();
    }
    
}
