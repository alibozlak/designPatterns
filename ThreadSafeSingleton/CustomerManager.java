package ThreadSafeSingleton;

class CustomerManager {

    private static CustomerManager customerManager;
    static Object lockObject = new Object();

    private CustomerManager(){

    }

    public static CustomerManager createAsSingleton() {
        if (customerManager == null) {
            customerManager = new CustomerManager();
        }
        return customerManager;
    }

    public void save() {
        System.out.println("Müşteri kaydedildi!");
    }

}
