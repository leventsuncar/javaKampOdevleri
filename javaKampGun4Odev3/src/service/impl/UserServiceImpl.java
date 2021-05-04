package service.impl;

import util.MernisAuthentication;
import util.PasswordAuthentication;
import entity.User;
import service.UserService;



public class UserServiceImpl implements UserService {
    PasswordAuthentication passwordAuthentication;
    MernisAuthentication mernisAuthentication;

    public UserServiceImpl(PasswordAuthentication passwordAuthentication,MernisAuthentication mernisAuthentication) {
        this.passwordAuthentication = passwordAuthentication;
        this.mernisAuthentication = mernisAuthentication;
    }

    @Override
    public void add(User user) throws Exception {
    if(mernisAuthentication.checkCustomer(user)==true){
        System.out.println(user.getUname()+" Kullanıcı Eklendi");
    }else{
        throw new IllegalArgumentException("Kullanıcı Bilgileri Doğrulanamadı");
        //exception yanlış bence.
    }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void login(User user) throws Exception {
        if(passwordAuthentication.checkPassword(user)==true){
            System.out.println("Giriş Başarılı");
        }else{
            throw new Exception("Kullanıcı bilgileri yanlış");
        }
    }
}
