package service;

import entity.Discount;
import entity.Product;

public interface DiscountService {
    void add(Discount discount);
    void delete(Discount discount);
    void update(Discount discount);
    void applyDiscount(Discount discount, Product product);
}
