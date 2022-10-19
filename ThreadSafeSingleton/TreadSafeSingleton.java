package ThreadSafeSingleton;

/**
 * Multi-tread programlamada Singleton Tasarım Deseni kullanımı
 */
class TreadSafeSingleton {
    public static void main(String[] args) {

        CustomerManager customerManager = CustomerManager.createAsSingleton();
        customerManager.save();
    }
}
