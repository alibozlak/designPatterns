package SingletonDesignPattern;

// Tek bir nesne oluşturulup sürekli kullanılacaksa bu deseni kullanmak iyidir.

/**
 * Singleton Design Pattern
 */
class Singleton {

    public static void main(String[] args) {
        
        CustomerManager customerManager = CustomerManager.createAsSingleton();
        customerManager.save();
    }
}