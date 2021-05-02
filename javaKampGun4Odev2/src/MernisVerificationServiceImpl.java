public class MernisVerificationServiceImpl implements VerificationService {
    @Override
    public Boolean checkCustomer(Customer customer) {
        System.out.println("Müşteri Kontrol Ediliyor: "+customer.getId());
        return true;

    }
}
