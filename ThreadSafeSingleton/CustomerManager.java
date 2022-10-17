package ThreadSafeSingleton;

class CustomerManager {

    private static CustomerManager customerManager;

    private CustomerManager(){

    }

    public static synchronized CustomerManager createAsSingleton() {
        if (customerManager == null) {
            customerManager = new CustomerManager();
        }
        return customerManager;
    }

    public void save() {
        System.out.println("Müşteri kaydedildi!");
    }

}
