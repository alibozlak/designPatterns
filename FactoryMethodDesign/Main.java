package FactoryMethodDesign;

/**
 * Factory Method Design Pattern
 */
public class Main {
    public static void main(String[] args) {
        
        // Günümüzde en çok kullanılan tasarım desenlerinden biridir.
        // Amaç yazılımda değişimi kontrol altında tutmaktır.

        CustomerManager customerManager = new CustomerManager(new LoggerFactory());
        customerManager.save();
    }
}
