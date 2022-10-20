package AbstractFactoryDesign;

/**
 * Abstract Factory Design Pattern
 */
class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new Factory1());
        productManager.getAll();
    }
}
