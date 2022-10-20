package AbstractFactoryDesign;

public abstract class CrossCuttingCorcernsFactory {
    public abstract Logging createLogger();
    public abstract Caching createCaching();
}
