package Util;

import entity.User;

public class MernisAuthentication {
    public static Boolean checkCustomer(User user){
        System.out.println(user.getFirstName()+" Adlı kullanıcı kontrol ediliyor"); //static olmasa daha iyi olur sanki
        //mernis'i buraya getirmem lazımdı normalde.
        return true;
    }
}
