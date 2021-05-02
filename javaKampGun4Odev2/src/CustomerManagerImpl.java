public class CustomerManagerImpl implements CustomerManager {

    @Override
    public void add(Customer customer) {
        System.out.println("Müsteri eklendi: "+customer.getId());
    }
}
