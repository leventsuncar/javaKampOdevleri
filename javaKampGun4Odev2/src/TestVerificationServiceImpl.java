public class TestVerificationServiceImpl implements VerificationService {
    @Override
    public Boolean checkCustomer(Customer customer) {
        System.out.println("Müşteri Kontrol Ediliyor: "+customer.getId());
        return false;
    }
}
//test servisi
