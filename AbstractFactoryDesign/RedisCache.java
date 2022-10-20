package AbstractFactoryDesign;

public class RedisCache extends Caching {

    @Override
    public void cache(String data) {
        System.out.println("Cached with RedisCache! Data : " + data);
    }
    
}
