package service.impl;

import Util.MernisAuthentication;
import Util.PasswordAuthentication;
import entity.User;
import service.UserService;



public class UserServiceImpl implements UserService {
    PasswordAuthentication passwordAuthentication;

    public UserServiceImpl(PasswordAuthentication passwordAuthentication) {
        this.passwordAuthentication = passwordAuthentication;
    }

    @Override
    public void add(User user) {
    if(MernisAuthentication.checkCustomer(user)==true){
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
