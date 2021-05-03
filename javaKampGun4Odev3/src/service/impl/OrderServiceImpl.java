package service.impl;

import entity.Product;
import entity.User;
import service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void buy(Product product, User user) {
        System.out.println(product.getName() + " adlı oyun " + user.getFirstName() +
                " tarafından " + product.getLastPrice() + " afyon dinarına satın aldı.");
    }
}
