package service;

import entity.Product;
import entity.User;

public interface OrderService {
    void buy(Product product, User user);
}
