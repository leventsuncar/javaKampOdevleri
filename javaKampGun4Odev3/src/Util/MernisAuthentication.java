package util;

import entity.User;
import mernis.HPQKPSPublicSoap;

public class MernisAuthentication {

    HPQKPSPublicSoap hpqkpsPublicSoap = new HPQKPSPublicSoap();

    public Boolean checkCustomer(User user) throws Exception {
        if (hpqkpsPublicSoap.TCKimlikNoDogrula(user.getNationalId(), user.getFirstName(), user.getLastName(), user.getBirthYear()) == true) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " Kimlik bilgileri doğrulandı");
            return true;
        } else {
            System.out.println("Kullanıcı Bilgileri hatalı");
            return false;
        }

    }
}
