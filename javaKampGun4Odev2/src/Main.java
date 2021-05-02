public class Main {

    public static void main(String[] args) {

        CustomerManagerImpl customerManager = new StarbucksCustomerManager(new TestVerificationServiceImpl());
        customerManager.add(new Customer(1, "levent", "suncar", "123"));

    }
}
