public class StarbucksCustomerManager extends CustomerManagerImpl {
    VerificationService verificationService;

    public StarbucksCustomerManager(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    @Override
    public void add(Customer customer) {
       if(verificationService.checkCustomer(customer)==true){
           System.out.println("doğrulandı eklendi: " + customer.getId());
       }else{
           throw new IllegalArgumentException("Müşteri Geçerli Değil");
       }

    }
}
