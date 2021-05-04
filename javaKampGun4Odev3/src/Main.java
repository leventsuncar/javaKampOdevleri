import util.MernisAuthentication;
import util.PasswordAuthentication;
import entity.Discount;
import entity.Product;
import entity.Order;
import entity.User;
import service.impl.DiscountServiceImpl;
import service.impl.ProductServiceImpl;
import service.impl.OrderServiceImpl;
import service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) throws Exception {
        Discount baharIndirimi = new Discount(1,"Bahar İndirimi","indirim",50);
        Product farCry = new Product(1,"Far Cry","Fps",150d,baharIndirimi);
        User levent = new User(1,"llevents","Levent","Suncar",1986 ,50740843382L,"123456");
        Order sales = new Order(1,farCry,levent);
        ProductServiceImpl productService = new ProductServiceImpl();
        DiscountServiceImpl discountService = new DiscountServiceImpl();
        OrderServiceImpl orderService = new OrderServiceImpl();
        MernisAuthentication mernisAuthentication = new MernisAuthentication();
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication();
        UserServiceImpl userService = new UserServiceImpl(passwordAuthentication,mernisAuthentication);
        userService.add(levent);
        userService.login(levent);
        discountService.add(baharIndirimi);
        discountService.applyDiscount(baharIndirimi,farCry);
        orderService.buy(farCry,levent);
   //10 tane new saydım :(
    }
}
